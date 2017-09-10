package com.madeofwu.will.service;

import java.util.List;

import com.madeofwu.will.pojo.BuyOrder;

public interface BuyOrderService {
	public List<BuyOrder> getAll();

	public String insert(BuyOrder buyOrder);

	public BuyOrder findById(String id);

	public void update(BuyOrder buyOrder);

	public void delete(String id);

	public void deleteBatch(List<String> ids);
	
	public List<BuyOrder> getBuyOrder();
}
