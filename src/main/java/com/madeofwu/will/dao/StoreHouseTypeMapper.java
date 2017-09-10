package com.madeofwu.will.dao;

import com.madeofwu.will.pojo.StoreHouseType;
import com.madeofwu.will.pojo.StoreHouseTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreHouseTypeMapper {
    int countByExample(StoreHouseTypeExample example);

    int deleteByExample(StoreHouseTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StoreHouseType record);

    int insertSelective(StoreHouseType record);

    List<StoreHouseType> selectByExample(StoreHouseTypeExample example);

    StoreHouseType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StoreHouseType record, @Param("example") StoreHouseTypeExample example);

    int updateByExample(@Param("record") StoreHouseType record, @Param("example") StoreHouseTypeExample example);

    int updateByPrimaryKeySelective(StoreHouseType record);

    int updateByPrimaryKey(StoreHouseType record);
}