package com.madeofwu.will.dao;

import com.madeofwu.will.pojo.BuyOrderDetail;
import com.madeofwu.will.pojo.BuyOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BuyOrderDetailMapper {
    int countByExample(BuyOrderDetailExample example);

    int deleteByExample(BuyOrderDetailExample example);

    int deleteByPrimaryKey(String bodId);

    int insert(BuyOrderDetail record);

    int insertSelective(BuyOrderDetail record);

    List<BuyOrderDetail> selectByExample(BuyOrderDetailExample example);

    BuyOrderDetail selectByPrimaryKey(String bodId);

    int updateByExampleSelective(@Param("record") BuyOrderDetail record, @Param("example") BuyOrderDetailExample example);

    int updateByExample(@Param("record") BuyOrderDetail record, @Param("example") BuyOrderDetailExample example);

    int updateByPrimaryKeySelective(BuyOrderDetail record);

    int updateByPrimaryKey(BuyOrderDetail record);
}