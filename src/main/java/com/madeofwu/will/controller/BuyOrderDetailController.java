package com.madeofwu.will.controller;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.madeofwu.will.pojo.BuyOrder;
import com.madeofwu.will.pojo.BuyOrderDetail;
import com.madeofwu.will.pojo.Goods;
import com.madeofwu.will.service.BuyOrderDetailService;
import com.madeofwu.will.service.BuyOrderService;
import com.madeofwu.will.service.GoodsService;
import com.madeofwu.will.utils.DateUtil;
import com.madeofwu.will.utils.Msg;

@Controller
public class BuyOrderDetailController {
	@Autowired
	private BuyOrderService buyOrderService;
	@Autowired
	private BuyOrderDetailService buyOrderDetailService;
	@Autowired
	private GoodsService goodsService;

	@RequestMapping(value = "/detail/boUpdate", method = RequestMethod.POST)
	public String updateBuyOrderDetailBoId(BuyOrderDetail buyOrderDetail,Model model) {
		String boId=buyOrderDetail.getBoId();
		String goodsName=buyOrderDetail.getGoodsName();
		String goodsType=buyOrderDetail.getGoodsType();
		String goodsColor=buyOrderDetail.getGoodsColor();
		String goodsProducer=buyOrderDetail.getGoodsProducer();
		int number=buyOrderDetail.getBodAmount();
		int nonumber=0;
		List<Goods> goods= goodsService.findBySome(goodsName, goodsType, goodsColor,goodsProducer);
		if(goods!=null&&!goods.isEmpty()){
			Iterator it = goods.iterator();
			while(it.hasNext()){
				Goods g = (Goods) it.next();
				int goodsStore=g.getGoodsStore();
				int allamount=goodsStore+number;
				g.setGoodsStore(allamount);
				g.setGoodsUpdated(DateUtil.ChangeDateSecond());
				goodsService.update(g);
				buyOrderDetail.setGoodsId(g.getGoodsId());
				buyOrderDetailService.update(buyOrderDetail);
				model.addAttribute("bodId", buyOrderDetail.getBodId());
				return "/cue/successbuy";
			}
		}else{
			BuyOrder buyOrder= buyOrderService.findById(boId);
			Goods newgoods= new Goods();
			newgoods.setGoodsId(UUID.randomUUID().toString());
			newgoods.setGoodsName(goodsName);
			newgoods.setGoodsType(goodsType);
			newgoods.setGoodsUnit(buyOrderDetail.getGoodsUnit());
			newgoods.setGoodsColor(goodsColor);
			newgoods.setGoodsStore(number);
			newgoods.setGoodsProducer(buyOrderDetail.getGoodsProducer());
			newgoods.setGoodsBuyPrice(buyOrderDetail.getBodBuyPrice());
			newgoods.setGoodsSelPrice(nonumber);
			newgoods.setGoodsRemark("新进产品请填写相应评价");
			newgoods.setGoodsStoreId(buyOrder.getShId());
			newgoods.setGoodsSupplierId(buyOrder.getSupId());
			newgoods.setGoodsCreated(DateUtil.ChangeDateSecond());
			newgoods.setGoodsUpdated(DateUtil.ChangeDateSecond());
			goodsService.buyOrderinsert(newgoods);
			buyOrderDetail.setGoodsId(newgoods.getGoodsId());
			buyOrderDetailService.update(buyOrderDetail);
			model.addAttribute("bodId", buyOrderDetail.getBodId());
			return "/cue/successbuy";
		}
		model.addAttribute("bodId", buyOrderDetail.getBodId());
		return "/cue/buyfail";
	}
	
	@RequestMapping(value = "/detail/bodUpdate", method = RequestMethod.POST)
	public String updateBodId(BuyOrderDetail buyOrderDetail,Model model) {
		String boId=buyOrderDetail.getBoId();
		String goodsName=buyOrderDetail.getGoodsName();
		String goodsType=buyOrderDetail.getGoodsType();
		String goodsColor=buyOrderDetail.getGoodsColor();
		String goodsProducer=buyOrderDetail.getGoodsProducer();
		int number=buyOrderDetail.getBodAmount();
		int nonumber=0;
		List<Goods> goods= goodsService.findBySome(goodsName, goodsType, goodsColor,goodsProducer);
		if(goods!=null&&!goods.isEmpty()){
			Iterator it = goods.iterator();
			while(it.hasNext()){
				Goods g = (Goods) it.next();
				int goodsStore=g.getGoodsStore();
				int allamount=goodsStore+number;
				g.setGoodsStore(allamount);
				g.setGoodsUpdated(DateUtil.ChangeDateSecond());
				goodsService.update(g);
				buyOrderDetail.setGoodsId(g.getGoodsId());
				buyOrderDetailService.update(buyOrderDetail);
				model.addAttribute("bodId", buyOrderDetail.getBodId());
				return "/cue/successbuy";
			}
		}else{
			BuyOrder buyOrder= buyOrderService.findById(boId);
			Goods newgoods= new Goods();
			newgoods.setGoodsId(UUID.randomUUID().toString());
			newgoods.setGoodsName(goodsName);
			newgoods.setGoodsType(goodsType);
			newgoods.setGoodsUnit(buyOrderDetail.getGoodsUnit());
			newgoods.setGoodsColor(goodsColor);
			newgoods.setGoodsStore(number);
			newgoods.setGoodsProducer(buyOrderDetail.getGoodsProducer());
			newgoods.setGoodsBuyPrice(buyOrderDetail.getBodBuyPrice());
			newgoods.setGoodsSelPrice(nonumber);
			newgoods.setGoodsRemark("新进产品请填写相应评价");
			newgoods.setGoodsStoreId(buyOrder.getShId());
			newgoods.setGoodsSupplierId(buyOrder.getSupId());
			newgoods.setGoodsCreated(DateUtil.ChangeDateSecond());
			newgoods.setGoodsUpdated(DateUtil.ChangeDateSecond());
			goodsService.buyOrderinsert(newgoods);
			buyOrderDetail.setGoodsId(newgoods.getGoodsId());
			buyOrderDetailService.update(buyOrderDetail);
			model.addAttribute("bodId", buyOrderDetail.getBodId());
			return "/cue/successbuy";
		}
		model.addAttribute("bodId", buyOrderDetail.getBodId());
		return "/cue/buyfail";
	}
	
	@RequestMapping("/buyOrderDetail/bos")
	@ResponseBody
	public Msg getBuyOrderDetailWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<BuyOrderDetail> bos = buyOrderDetailService.getAll();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(bos, 5);
		return Msg.success().add("pageInfo", page);
	}
	@RequestMapping("/buyOrderDetail/Detaillist")
	public String List() {
		return "/buyOrderDetail/Detaillist";
	}
	
	@RequestMapping("/buyOrderDetail/OneDetaillist")
	public String getSelectBuyOrderDetail(@RequestParam("search") String search,
			Model model) {
		BuyOrderDetail buyOrderDetail = new BuyOrderDetail();
		buyOrderDetail = buyOrderDetailService.findByBodId(search);
		if (buyOrderDetail != null) {
			String boId = buyOrderDetail.getBoId();
			model.addAttribute("boId", boId);
			return "/buyOrderDetail/OneDetaillist";
		}
		return "/cue/404";
	}
	@RequestMapping(value = "/buyOrderDetail/bo/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getOneDetailAll(@PathVariable("id") String id,
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 1);
		List<BuyOrderDetail> buyOrderDetail=buyOrderDetailService.findByBoId(id);
		PageInfo page = new PageInfo(buyOrderDetail,1);
		return Msg.success().add("pageInfo", page);
	}
}
