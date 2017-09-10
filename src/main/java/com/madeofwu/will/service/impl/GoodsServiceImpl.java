package com.madeofwu.will.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.will.dao.GoodsMapper;
import com.madeofwu.will.pojo.Goods;
import com.madeofwu.will.pojo.GoodsExample;
import com.madeofwu.will.pojo.GoodsExample.Criteria;
import com.madeofwu.will.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;

	@Override
	public List<Goods> getAll() {
		// TODO Auto-generated method stub
		return goodsMapper.selectByExampleWithSupAndSh(null);
	}

	@Override
	public void insert(Goods goods) {
		// TODO Auto-generated method stub
		goods.setGoodsId(UUID.randomUUID().toString());
		String updated = goods.getGoodsCreated();
		goods.setGoodsUpdated(updated);
		int goodsStore=0;
		goods.setGoodsStore(goodsStore);
		//System.out.print(goods);
		goodsMapper.insertSelective(goods);
	}

	@Override
	public Goods findById(String id) {
		// TODO Auto-generated method stub
		Goods goods= goodsMapper.selectByPrimaryKey(id);
		
		return goods;
	}

	@Override
	public void update(Goods goods) {
		// TODO Auto-generated method stub
		
		goodsMapper.updateByPrimaryKey(goods);
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		goodsMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void deleteBatch(List<String> ids) {
		// TODO Auto-generated method stub
		GoodsExample example = new GoodsExample();
		Criteria criteria = example.createCriteria();
		criteria.andGoodsIdIn(ids);
		goodsMapper.deleteByExample(example);
	}

	@Override
	public List<Goods> findBySome(String goodsName, String goodsType,
			String goodsColor,String goodsProducer) {
		// TODO Auto-generated method stub
		GoodsExample example = new GoodsExample();
		Criteria criteria = example.createCriteria();
		criteria.andGoodsNameEqualTo(goodsName);
		criteria.andGoodsTypeEqualTo(goodsType);
		criteria.andGoodsColorEqualTo(goodsColor);
		criteria.andGoodsProducerEqualTo(goodsProducer);
		List<Goods> goods=goodsMapper.selectByExample(example);
		return goods;
	}

	@Override
	public void buyOrderinsert(Goods goods) {
		// TODO Auto-generated method stub
		goodsMapper.insertSelective(goods);
	}

	@Override
	public List<Goods> findBySomeNoProducer(String goodsName, String goodsType,
			String goodsColor) {
		// TODO Auto-generated method stub
		GoodsExample example = new GoodsExample();
		Criteria criteria = example.createCriteria();
		criteria.andGoodsNameEqualTo(goodsName);
		criteria.andGoodsTypeEqualTo(goodsType);
		criteria.andGoodsColorEqualTo(goodsColor);
		List<Goods> goods=goodsMapper.selectByExample(example);
		return goods;
	}

	

}
