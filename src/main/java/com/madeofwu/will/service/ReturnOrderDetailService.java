package com.madeofwu.will.service;

import java.util.List;

import com.madeofwu.will.pojo.ReturnOrderDetail;

public interface ReturnOrderDetailService {
	
	public List<ReturnOrderDetail> getAll();
	
	public ReturnOrderDetail findByRodId(String id);

	public List<ReturnOrderDetail> findByRoId(String id);

	public void insert(ReturnOrderDetail returnOrderDetail);

	public void update(ReturnOrderDetail returnOrderDetail);

	public void delete(String id);

	public void deleteBatch(List<String> ids);
}
