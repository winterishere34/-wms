package com.madeofwu.will.dao;

import com.madeofwu.will.pojo.Supplier;
import com.madeofwu.will.pojo.SupplierExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupplierMapper {
    int countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(Integer supId);

    int insert(Supplier record);

    int insertSelective(Supplier record);
    
    List<Supplier> selectByExampleWithType(SupplierExample example);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKey(Integer supId);
    
    Supplier selectByPrimaryKeyWithType(Integer supId);

    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}