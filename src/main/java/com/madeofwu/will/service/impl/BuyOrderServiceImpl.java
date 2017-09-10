package com.madeofwu.will.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.will.dao.BuyOrderDetailMapper;
import com.madeofwu.will.dao.BuyOrderMapper;
import com.madeofwu.will.pojo.BuyOrder;
import com.madeofwu.will.pojo.BuyOrderDetail;
import com.madeofwu.will.pojo.BuyOrderExample;
import com.madeofwu.will.pojo.BuyOrderExample.Criteria;
import com.madeofwu.will.service.BuyOrderService;
@Service
public class BuyOrderServiceImpl implements BuyOrderService {

	@Autowired
	private BuyOrderMapper buyOrderMapper;
	@Autowired
	private BuyOrderDetailMapper buyOrderDetailMapper;
	
	@Override
	public List<BuyOrder> getAll() {
		// TODO Auto-generated method stub
		return buyOrderMapper.selectByExampleWithSupAndShAndUser(null);
	}

	@Override
	public String insert(BuyOrder buyOrder) {
		// TODO Auto-generated method stub
		buyOrder.setBoId(UUID.randomUUID().toString());
		buyOrder.setBoOriginal(UUID.randomUUID().toString());
		buyOrderMapper.insertSelective(buyOrder);
		BuyOrderDetail buyOrderDetail = new BuyOrderDetail();
		buyOrderDetail.setBodId(buyOrder.getBoOriginal());
		buyOrderDetail.setBoId(buyOrder.getBoId());
		buyOrderDetailMapper.insertSelective(buyOrderDetail);
		String BoId=buyOrder.getBoId();
		return BoId;
	}

	@Override
	public BuyOrder findById(String id) {
		// TODO Auto-generated method stub
		BuyOrder buyOrder = buyOrderMapper.selectByPrimaryKey(id);
		return buyOrder;
	}

	@Override
	public void update(BuyOrder buyOrder) {
		// TODO Auto-generated method stub
		buyOrderMapper.updateByPrimaryKey(buyOrder);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
        buyOrderMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteBatch(List<String> ids) {
		// TODO Auto-generated method stub
		BuyOrderExample example = new BuyOrderExample();
		Criteria criteria = example.createCriteria();
		criteria.andBoIdIn(ids);
		buyOrderMapper.deleteByExample(example);
	}

	@Override
	public List<BuyOrder> getBuyOrder() {
		// TODO Auto-generated method stub
		List<BuyOrder> list = buyOrderMapper.selectByExample(null);
		return list;
	}

}
