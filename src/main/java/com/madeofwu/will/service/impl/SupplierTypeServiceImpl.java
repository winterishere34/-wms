package com.madeofwu.will.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.will.dao.SupplierTypeMapper;
import com.madeofwu.will.pojo.SupplierType;
import com.madeofwu.will.service.SupplierTypeService;

@Service
public class SupplierTypeServiceImpl implements SupplierTypeService {
	@Autowired
	private SupplierTypeMapper SupplierTypeMapper;

	@Override
	public List<SupplierType> getTypes() {
		// TODO Auto-generated method stub
		List<SupplierType> list = SupplierTypeMapper.selectByExample(null);
		return list;
	}

}
