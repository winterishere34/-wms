package com.madeofwu.will.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.will.dao.ReturnOrderDetailMapper;
import com.madeofwu.will.dao.ReturnOrderMapper;
import com.madeofwu.will.pojo.ReturnOrder;
import com.madeofwu.will.pojo.ReturnOrderDetail;
import com.madeofwu.will.pojo.ReturnOrderExample;
import com.madeofwu.will.pojo.ReturnOrderExample.Criteria;
import com.madeofwu.will.service.ReturnOrderService;

@Service
public class ReturnOrderServiceImpl implements ReturnOrderService {
	@Autowired
	private ReturnOrderMapper returnOrderMapper;
	@Autowired
	private ReturnOrderDetailMapper returnOrderDetailMapper;

	@Override
	public List<ReturnOrder> getAll() {
		// TODO Auto-generated method stub
		return returnOrderMapper.selectByExampleWithSupAndShAndUser(null);
	}

	@Override
	public String insert(ReturnOrder returnOrder) {
		// TODO Auto-generated method stub
		returnOrder.setRoId(UUID.randomUUID().toString());
		returnOrder.setRoOriginal(UUID.randomUUID().toString());
		returnOrderMapper.insertSelective(returnOrder);
		ReturnOrderDetail returnOrderDetail = new ReturnOrderDetail();
		returnOrderDetail.setRoId(returnOrder.getRoId());
		returnOrderDetail.setRodId(returnOrder.getRoOriginal());
		returnOrderDetailMapper.insertSelective(returnOrderDetail);
		String RoId = returnOrder.getRoId();
		return RoId;
	}

	@Override
	public ReturnOrder findById(String id) {
		// TODO Auto-generated method stub
		ReturnOrder returnOrder = returnOrderMapper.selectByPrimaryKey(id);
		return returnOrder;
	}

	@Override
	public void update(ReturnOrder returnOrder) {
		// TODO Auto-generated method stub
		returnOrderMapper.updateByPrimaryKey(returnOrder);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		returnOrderMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteBatch(List<String> ids) {
		// TODO Auto-generated method stub
		ReturnOrderExample example = new ReturnOrderExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoIdIn(ids);
		returnOrderMapper.deleteByExample(example);
	}

	@Override
	public List<ReturnOrder> getReturnOrder() {
		// TODO Auto-generated method stub
		List<ReturnOrder> list = returnOrderMapper.selectByExample(null);
		return list;
	}

}
