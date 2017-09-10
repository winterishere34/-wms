package com.madeofwu.will.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.will.dao.StoreHouseMapper;
import com.madeofwu.will.pojo.StoreHouse;
import com.madeofwu.will.pojo.StoreHouseExample;
import com.madeofwu.will.pojo.StoreHouseExample.Criteria;
import com.madeofwu.will.service.StoreHouseService;
@Service
public class StoreHouseServiceImpl implements StoreHouseService {

	@Autowired
	private StoreHouseMapper storeHouseMapper;

	@Override
	public List<StoreHouse> getAll() {
		// TODO Auto-generated method stub
		return storeHouseMapper.selectByExampleWithType(null);
	}

	@Override
	public void insert(StoreHouse storeHouse) {
		// TODO Auto-generated method stub
		storeHouseMapper.insertSelective(storeHouse);
	}

	@Override
	public StoreHouse findById(Integer id) {
		// TODO Auto-generated method stub
		StoreHouse storeHouse = storeHouseMapper.selectByPrimaryKey(id);
		return storeHouse;
	}

	@Override
	public void update(StoreHouse storeHouse) {
		// TODO Auto-generated method stub
		storeHouseMapper.updateByPrimaryKey(storeHouse);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		storeHouseMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		StoreHouseExample example = new StoreHouseExample();
		Criteria criteria = example.createCriteria();
		criteria.andShIdIn(ids);
		storeHouseMapper.deleteByExample(example);
	}

	@Override
	public List<StoreHouse> getStoreHouses() {
		// TODO Auto-generated method stub
		List<StoreHouse> list = storeHouseMapper.selectByExample(null);
		return list;
	}

}
