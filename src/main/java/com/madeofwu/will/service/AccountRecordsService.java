package com.madeofwu.will.service;

import java.util.List;

import com.madeofwu.will.pojo.AccountRecords;

public interface AccountRecordsService {
	public List<AccountRecords> getAll();

	public String insert(AccountRecords accountRecords);

	public AccountRecords findById(String id);

	public void update(AccountRecords accountRecords);

	public void delete(String id);

	public void deleteBatch(List<String> ids);

	public List<AccountRecords> getAccountRecords(String id);
}
