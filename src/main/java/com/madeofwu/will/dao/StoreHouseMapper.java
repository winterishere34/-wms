package com.madeofwu.will.dao;

import com.madeofwu.will.pojo.StoreHouse;
import com.madeofwu.will.pojo.StoreHouseExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface StoreHouseMapper {
    int countByExample(StoreHouseExample example);

    int deleteByExample(StoreHouseExample example);

    int deleteByPrimaryKey(Integer shId);

    int insert(StoreHouse record);

    int insertSelective(StoreHouse record);
    
    List<StoreHouse> selectByExampleWithType(StoreHouseExample example);

    List<StoreHouse> selectByExample(StoreHouseExample example);

    StoreHouse selectByPrimaryKey(Integer shId);

    int updateByExampleSelective(@Param("record") StoreHouse record, @Param("example") StoreHouseExample example);

    int updateByExample(@Param("record") StoreHouse record, @Param("example") StoreHouseExample example);

    int updateByPrimaryKeySelective(StoreHouse record);

    int updateByPrimaryKey(StoreHouse record);
}