package org.zxl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.zxl.model.Stock;
import org.zxl.model.StockRecord;
import org.zxl.model.SysPara;
import org.zxl.model.User;
import org.zxl.service.StockService;
import org.zxl.service.UserService;
import org.zxl.utils.MVUtil;
import org.zxl.utils.StatusTool;

import java.util.List;

/**
 * Created by zxl_lls@foxmail.com on 2018/2/27.
 */
@RestController
@CrossOrigin
@RequestMapping("/stockManage")
public class StockController {
	@Autowired
	public StockService stockService;
	@RequestMapping("")
	public ModelAndView stock(MVUtil mvu){
		ModelAndView mv = mvu.getMV();
		mv.setViewName("system/main_html/stockManage");
		List<Stock> stockList = stockService.getStockList();
		mv.addObject(stockList);
		return mv;
	}
	@RequestMapping("/save")
	public StatusTool addStock(Stock stock){
		int status = stockService.insert(stock);

		return new StatusTool().getStatusObj("200",stock);
	}

	@RequestMapping("/add")
	public ModelAndView addPage(MVUtil mvu){
		ModelAndView mv = mvu.getMV();
		mv.setViewName("system/views/stock/stockAdd");

		return mv;
	}

	@RequestMapping("/delete")
	public StatusTool deleteStock(String id){
		int status = stockService.deleteById(id);

		return new StatusTool().getStatusObj("200",id);
	}
	@RequestMapping("/oper")
	public StatusTool operStock(StockRecord stockRecord){
		int status = stockService.operStock(stockRecord);

		return new StatusTool().getStatusObj("200",stockRecord);
	}
	@RequestMapping("/stockRecords")
	public ModelAndView stockRecords(MVUtil mvu){
		ModelAndView mv = mvu.getMV();
		mv.setViewName("system/main_html/stockRecords");
		List<StockRecord> stockRecordList = stockService.getStockRecordList();
		mv.addObject(stockRecordList);
		return mv;
	}
	@RequestMapping("/stockOper")
	public ModelAndView oper(MVUtil mvu,Stock stock){
		ModelAndView mv = mvu.getMV();
		mv.setViewName("system/views/stock/stockOper");
		mv.addObject(stock);
		return mv;
	}
}
