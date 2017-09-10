package com.madeofwu.will.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.will.dao.SupplierMapper;
import com.madeofwu.will.pojo.Supplier;
import com.madeofwu.will.pojo.SupplierExample;
import com.madeofwu.will.pojo.SupplierExample.Criteria;
import com.madeofwu.will.service.SupplierService;

@Service
public class SupplierServiceImpl implements SupplierService {
	@Autowired
	private SupplierMapper supplierMapper;

	@Override
	public List<Supplier> getAll() {
		// TODO Auto-generated method stub
		return supplierMapper.selectByExampleWithType(null);
	}

	@Override
	public void insert(Supplier supplier) {
		// TODO Auto-generated method stub
		supplierMapper.insertSelective(supplier);
	}

	@Override
	public Supplier findById(Integer id) {
		// TODO Auto-generated method stub
		Supplier supplier = supplierMapper.selectByPrimaryKey(id);
		return supplier;
	}

	@Override
	public void update(Supplier supplier) {
		// TODO Auto-generated method stub
		supplierMapper.updateByPrimaryKey(supplier);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		supplierMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		SupplierExample example = new SupplierExample();
		Criteria criteria = example.createCriteria();
		criteria.andSupIdIn(ids);
		supplierMapper.deleteByExample(example);
	}

	@Override
	public List<Supplier> getSuppliers() {
		// TODO Auto-generated method stub
		List<Supplier> list = supplierMapper.selectByExample(null);
		return list;
	}

}
