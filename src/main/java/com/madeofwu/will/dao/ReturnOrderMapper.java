package com.madeofwu.will.dao;

import com.madeofwu.will.pojo.ReturnOrder;
import com.madeofwu.will.pojo.ReturnOrderExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ReturnOrderMapper {
    int countByExample(ReturnOrderExample example);

    int deleteByExample(ReturnOrderExample example);

    int deleteByPrimaryKey(String roId);

    int insert(ReturnOrder record);

    int insertSelective(ReturnOrder record);
    
    List<ReturnOrder> selectByExampleWithSupAndShAndUser(ReturnOrderExample example);

    List<ReturnOrder> selectByExample(ReturnOrderExample example);

    ReturnOrder selectByPrimaryKey(String roId);

    int updateByExampleSelective(@Param("record") ReturnOrder record, @Param("example") ReturnOrderExample example);

    int updateByExample(@Param("record") ReturnOrder record, @Param("example") ReturnOrderExample example);

    int updateByPrimaryKeySelective(ReturnOrder record);

    int updateByPrimaryKey(ReturnOrder record);
}