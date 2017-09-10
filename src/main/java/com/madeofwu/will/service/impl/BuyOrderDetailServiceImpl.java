package com.madeofwu.will.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.will.dao.BuyOrderDetailMapper;
import com.madeofwu.will.dao.BuyOrderMapper;
import com.madeofwu.will.pojo.BuyOrder;
import com.madeofwu.will.pojo.BuyOrderDetail;
import com.madeofwu.will.pojo.BuyOrderDetailExample;
import com.madeofwu.will.pojo.BuyOrderDetailExample.Criteria;
import com.madeofwu.will.service.BuyOrderDetailService;
@Service
public class BuyOrderDetailServiceImpl implements BuyOrderDetailService {

	@Autowired
	private BuyOrderMapper buyOrderMapper;
	@Autowired
	private BuyOrderDetailMapper buyOrderDetailMapper;
	@Override
	public BuyOrderDetail findByBodId(String id) {
		// TODO Auto-generated method stub
		BuyOrderDetail buyOrderDetail = buyOrderDetailMapper.selectByPrimaryKey(id);
		return buyOrderDetail;
	}

	@Override
	public List<BuyOrderDetail> findByBoId(String id) {
		// TODO Auto-generated method stub
		BuyOrderDetailExample example = new BuyOrderDetailExample();
		Criteria criteria =example.createCriteria();
		criteria.andBoIdEqualTo(id);
		List<BuyOrderDetail> buyOrderDetail = buyOrderDetailMapper.selectByExample(example);
		return buyOrderDetail;
	}
    //在填写进货单时已经进行新增但内容不全
	@Override
	public void insert(BuyOrderDetail buyOrderDetail) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BuyOrderDetail buyOrderDetail) {
		// TODO Auto-generated method stub
		buyOrderDetailMapper.updateByPrimaryKey(buyOrderDetail);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		BuyOrderDetailExample example = new BuyOrderDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andBoIdEqualTo(id);
		buyOrderDetailMapper.deleteByExample(example);
	}

	@Override
	public void deleteBatch(List<String> ids) {
		// TODO Auto-generated method stub
		BuyOrderDetailExample example = new BuyOrderDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andBoIdIn(ids);
		buyOrderDetailMapper.deleteByExample(example);
	}

	@Override
	public List<BuyOrderDetail> getAll() {
		// TODO Auto-generated method stub
		return buyOrderDetailMapper.selectByExample(null);
	}

}
