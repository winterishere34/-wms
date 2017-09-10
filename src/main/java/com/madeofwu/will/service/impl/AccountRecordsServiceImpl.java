package com.madeofwu.will.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.will.dao.AccountRecordsMapper;
import com.madeofwu.will.pojo.AccountRecords;
import com.madeofwu.will.pojo.AccountRecordsExample;
import com.madeofwu.will.pojo.AccountRecordsExample.Criteria;
import com.madeofwu.will.service.AccountRecordsService;
@Service
public class AccountRecordsServiceImpl implements AccountRecordsService {

	@Autowired
	private AccountRecordsMapper accountRecordsMapper;
	@Override
	public List<AccountRecords> getAll() {
		// TODO Auto-generated method stub
		return accountRecordsMapper.selectByExampleWithSupAndShAndUser(null);
	}

	@Override
	public String insert(AccountRecords accountRecords) {
		// TODO Auto-generated method stub
		accountRecords.setArId(UUID.randomUUID().toString());
		accountRecordsMapper.insertSelective(accountRecords);
		String arId = accountRecords.getArId();
		return arId;
	}

	@Override
	public AccountRecords findById(String id) {
		// TODO Auto-generated method stub
		AccountRecords accountRecords = accountRecordsMapper.selectByPrimaryKey(id);
		return accountRecords;
	}

	@Override
	public void update(AccountRecords accountRecords) {
		// TODO Auto-generated method stub
		accountRecordsMapper.updateByPrimaryKey(accountRecords);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		accountRecordsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteBatch(List<String> ids) {
		// TODO Auto-generated method stub
		AccountRecordsExample example = new AccountRecordsExample();
		Criteria criteria=example.createCriteria();
		criteria.andArIdIn(ids);
		accountRecordsMapper.deleteByExample(example);
	}

	@Override
	public List<AccountRecords> getAccountRecords(String arId) {
		// TODO Auto-generated method stub
		List<AccountRecords> list = accountRecordsMapper.selectByPrimaryKeyWithSupAndShAndUser(arId);
		return list;
	}

}
