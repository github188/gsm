package org.zxl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zxl.mapper.StockMapper;
import org.zxl.mapper.StockRecordMapper;
import org.zxl.model.Stock;
import org.zxl.model.StockRecord;
import org.zxl.utils.UUIDTool;
import org.zxl.utils.UtilDate;

import java.util.Date;
import java.util.List;

/**
 * Created by zxl_lls@foxmail.com on 2018/2/28.
 */
@Service
public class StockService {
	@Autowired
	public StockMapper stockMapper;
	@Autowired
	public StockRecordMapper stockRecordMapper;

	public List<Stock> getStockList(){

		return stockMapper.getStockList();
	}
	public List<StockRecord> getStockRecordList(){
		List<StockRecord> stockRecordList = stockRecordMapper.getStockRecordList();

		return stockRecordList;
	}
	public int insert(Stock stock){
//		Stock stockS = this.stockMapper.selectByAccName(stock.getAccName());
			stock.setId(UUIDTool.getUUID());
			stock.setCreateDate(new Date());
			stock.setDelFlag("0");
			stock.setUpdateDate(new Date());
			return stockMapper.insert(stock);


	}
	public int deleteByPrimaryKey(String id){
		return stockMapper.deleteByPrimaryKey(id);
	}
	public int deleteById(String id){
		Stock stock = new Stock();
		stock.setId(id);
		stock.setDelFlag("1");
		return stockMapper.updateByPrimaryKeySelective(stock);
	}
	public int operStock(StockRecord stockRecord){
		stockRecord.setId(UUIDTool.getUUID());
		stockRecord.setCreateDate(new Date());
		stockRecord.setCreateId("1");
		int a =stockRecordMapper.insert(stockRecord);
		Stock stock = stockMapper.selectByPrimaryKey(stockRecord.getType());
		stock.setUpdateDate(stockRecord.getCreateDate());
		if(stockRecord.getOperType().equals("1")){
			stock.setQuantity(Integer.parseInt(stock.getQuantity())+Integer.parseInt(stockRecord.getQuantity())+"");
		}else{
			stock.setQuantity(Integer.parseInt(stock.getQuantity())-Integer.parseInt(stockRecord.getQuantity())+"");
		}
		int b =stockMapper.updateByPrimaryKeySelective(stock);
		return a+b;
	}
}
