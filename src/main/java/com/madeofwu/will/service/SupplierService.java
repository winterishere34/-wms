package com.madeofwu.will.service;

import java.util.List;

import com.madeofwu.will.pojo.Supplier;

public interface SupplierService {

	public List<Supplier> getAll();
	
	public void insert(Supplier supplier);
	
	public Supplier findById(Integer id);
	
	public void update(Supplier supplier);
	
	public void delete(Integer id);
	
	public void deleteBatch(List<Integer> ids);
	
	public List<Supplier> getSuppliers();
	
}
