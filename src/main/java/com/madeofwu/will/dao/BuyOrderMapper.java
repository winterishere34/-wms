package com.madeofwu.will.dao;

import com.madeofwu.will.pojo.BuyOrder;
import com.madeofwu.will.pojo.BuyOrderExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BuyOrderMapper {
    int countByExample(BuyOrderExample example);

    int deleteByExample(BuyOrderExample example);

    int deleteByPrimaryKey(String boId);

    int insert(BuyOrder record);

    int insertSelective(BuyOrder record);
    
    List<BuyOrder> selectByExampleWithSupAndShAndUser(BuyOrderExample example);

    List<BuyOrder> selectByExample(BuyOrderExample example);

    BuyOrder selectByPrimaryKey(String boId);

    int updateByExampleSelective(@Param("record") BuyOrder record, @Param("example") BuyOrderExample example);

    int updateByExample(@Param("record") BuyOrder record, @Param("example") BuyOrderExample example);

    int updateByPrimaryKeySelective(BuyOrder record);

    int updateByPrimaryKey(BuyOrder record);
}