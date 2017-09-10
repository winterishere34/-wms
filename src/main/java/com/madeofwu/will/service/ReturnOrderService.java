package com.madeofwu.will.service;

import java.util.List;

import com.madeofwu.will.pojo.ReturnOrder;

public interface ReturnOrderService {
	public List<ReturnOrder> getAll();

	public String insert(ReturnOrder returnOrder);

	public ReturnOrder findById(String id);

	public void update(ReturnOrder returnOrder);

	public void delete(String id);

	public void deleteBatch(List<String> ids);
	
	public List<ReturnOrder> getReturnOrder();
}
