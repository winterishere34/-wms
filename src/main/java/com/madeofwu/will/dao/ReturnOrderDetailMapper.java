package com.madeofwu.will.dao;

import com.madeofwu.will.pojo.ReturnOrderDetail;
import com.madeofwu.will.pojo.ReturnOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReturnOrderDetailMapper {
    int countByExample(ReturnOrderDetailExample example);

    int deleteByExample(ReturnOrderDetailExample example);

    int deleteByPrimaryKey(String rodId);

    int insert(ReturnOrderDetail record);

    int insertSelective(ReturnOrderDetail record);

    List<ReturnOrderDetail> selectByExample(ReturnOrderDetailExample example);

    ReturnOrderDetail selectByPrimaryKey(String rodId);

    int updateByExampleSelective(@Param("record") ReturnOrderDetail record, @Param("example") ReturnOrderDetailExample example);

    int updateByExample(@Param("record") ReturnOrderDetail record, @Param("example") ReturnOrderDetailExample example);

    int updateByPrimaryKeySelective(ReturnOrderDetail record);

    int updateByPrimaryKey(ReturnOrderDetail record);
}