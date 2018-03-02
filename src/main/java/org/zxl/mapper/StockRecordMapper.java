package org.zxl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.zxl.model.StockRecord;

import java.util.List;

@Mapper
public interface StockRecordMapper {
    int deleteByPrimaryKey(String id);

    int insert(StockRecord record);

    int insertSelective(StockRecord record);

    List<StockRecord> getStockRecordList();

    StockRecord selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(StockRecord record);

    int updateByPrimaryKey(StockRecord record);
}