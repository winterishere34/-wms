package com.madeofwu.will.dao;

import com.madeofwu.will.pojo.AccountRecords;
import com.madeofwu.will.pojo.AccountRecordsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AccountRecordsMapper {
    int countByExample(AccountRecordsExample example);

    int deleteByExample(AccountRecordsExample example);

    int deleteByPrimaryKey(String arId);

    int insert(AccountRecords record);

    int insertSelective(AccountRecords record);
    
    List<AccountRecords> selectByExampleWithSupAndShAndUser(AccountRecordsExample example);
    
    List<AccountRecords> selectByPrimaryKeyWithSupAndShAndUser(String arId);

    List<AccountRecords> selectByExample(AccountRecordsExample example);

    AccountRecords selectByPrimaryKey(String arId);

    int updateByExampleSelective(@Param("record") AccountRecords record, @Param("example") AccountRecordsExample example);

    int updateByExample(@Param("record") AccountRecords record, @Param("example") AccountRecordsExample example);

    int updateByPrimaryKeySelective(AccountRecords record);

    int updateByPrimaryKey(AccountRecords record);
}