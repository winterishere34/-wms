package com.madeofwu.will.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.will.dao.StoreHouseTypeMapper;
import com.madeofwu.will.pojo.StoreHouseType;
import com.madeofwu.will.service.StoreHouseTypeService;

@Service
public class StoreHouseTypeServiceImpl implements StoreHouseTypeService {

	@Autowired
	private StoreHouseTypeMapper storeHouseTypeMapper;

	@Override
	public List<StoreHouseType> getTypes() {
		// TODO Auto-generated method stub
		List<StoreHouseType> list = storeHouseTypeMapper.selectByExample(null);
		return list;
	}

}
