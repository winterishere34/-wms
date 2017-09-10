package com.madeofwu.will.service;

import java.util.List;

import com.madeofwu.will.pojo.BuyOrderDetail;

public interface BuyOrderDetailService {
	
	public List<BuyOrderDetail> getAll();

	public BuyOrderDetail findByBodId(String id);
	
	public List<BuyOrderDetail> findByBoId(String id);
	
	public void insert(BuyOrderDetail buyOrderDetail);

	public void update(BuyOrderDetail buyOrderDetail);

	public void delete(String id);

	public void deleteBatch(List<String> ids);
	
}
