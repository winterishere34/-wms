package com.madeofwu.will.dao;

import com.madeofwu.will.pojo.SupplierType;
import com.madeofwu.will.pojo.SupplierTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierTypeMapper {
    int countByExample(SupplierTypeExample example);

    int deleteByExample(SupplierTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SupplierType record);

    int insertSelective(SupplierType record);

    List<SupplierType> selectByExample(SupplierTypeExample example);

    SupplierType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SupplierType record, @Param("example") SupplierTypeExample example);

    int updateByExample(@Param("record") SupplierType record, @Param("example") SupplierTypeExample example);

    int updateByPrimaryKeySelective(SupplierType record);

    int updateByPrimaryKey(SupplierType record);
}