package org.zxl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.zxl.model.Stock;

import java.util.List;
@Mapper
public interface StockMapper {
    int deleteByPrimaryKey(String id);

    int insert(Stock record);

    int insertSelective(Stock record);
    List<Stock> getStockList();
    Stock selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Stock record);

    int updateByPrimaryKey(Stock record);
}