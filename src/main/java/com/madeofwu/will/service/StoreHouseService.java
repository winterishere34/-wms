package com.madeofwu.will.service;

import java.util.List;

import com.madeofwu.will.pojo.StoreHouse;

public interface StoreHouseService {
	public List<StoreHouse> getAll();

	public void insert(StoreHouse storeHouse);

	public StoreHouse findById(Integer id);

	public void update(StoreHouse storeHouse);

	public void delete(Integer id);

	public void deleteBatch(List<Integer> ids);
	
	public List<StoreHouse> getStoreHouses();
}
