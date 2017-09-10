package com.madeofwu.will.service;

import java.util.List;

import com.madeofwu.will.pojo.Goods;

public interface GoodsService {
	public List<Goods> getAll();

	public void insert(Goods goods);
	
	public void buyOrderinsert(Goods goods);

	public Goods findById(String id);

	public void update(Goods goods);

	public void delete(String id);

	public void deleteBatch(List<String> ids);
	
	public List<Goods> findBySome(String goodsName,String goodsType,String goodsColor,String goodsProducer);
	
	public List<Goods> findBySomeNoProducer(String goodsName,String goodsType,String goodsColor);
}
