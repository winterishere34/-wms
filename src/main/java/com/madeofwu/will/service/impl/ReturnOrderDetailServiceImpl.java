package com.madeofwu.will.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.will.dao.ReturnOrderDetailMapper;
import com.madeofwu.will.dao.ReturnOrderMapper;
import com.madeofwu.will.pojo.BuyOrderDetail;
import com.madeofwu.will.pojo.ReturnOrderDetail;
import com.madeofwu.will.pojo.ReturnOrderDetailExample;
import com.madeofwu.will.pojo.ReturnOrderDetailExample.Criteria;
import com.madeofwu.will.service.ReturnOrderDetailService;

@Service
public class ReturnOrderDetailServiceImpl implements ReturnOrderDetailService {
	@Autowired
	private ReturnOrderMapper returnOrderMapper;
	@Autowired
	private ReturnOrderDetailMapper returnOrderDetailMapper;

	@Override
	public ReturnOrderDetail findByRodId(String id) {
		// TODO Auto-generated method stub
		ReturnOrderDetail returnOrderDetail = returnOrderDetailMapper.selectByPrimaryKey(id);
		return returnOrderDetail;
	}

	@Override
	public List<ReturnOrderDetail> findByRoId(String id) {
		// TODO Auto-generated method stub
		ReturnOrderDetailExample example = new ReturnOrderDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoIdEqualTo(id);
		List<ReturnOrderDetail> returnOrderDetail = returnOrderDetailMapper.selectByExample(example);
		return returnOrderDetail;
	}
	//在填写退货单时已经进行新增但内容不全
	@Override
	public void insert(ReturnOrderDetail returnOrderDetail) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(ReturnOrderDetail returnOrderDetail) {
		// TODO Auto-generated method stub
		returnOrderDetailMapper.updateByPrimaryKey(returnOrderDetail);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		ReturnOrderDetailExample example = new ReturnOrderDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoIdEqualTo(id);
		returnOrderDetailMapper.deleteByExample(example);
	}

	@Override
	public void deleteBatch(List<String> ids) {
		// TODO Auto-generated method stub
		ReturnOrderDetailExample example = new ReturnOrderDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoIdIn(ids);
		returnOrderDetailMapper.deleteByExample(example);
	}

	@Override
	public List<ReturnOrderDetail> getAll() {
		// TODO Auto-generated method stub
		return returnOrderDetailMapper.selectByExample(null);
	}

}
