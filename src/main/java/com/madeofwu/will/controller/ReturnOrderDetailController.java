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
import com.madeofwu.will.pojo.ReturnOrder;
import com.madeofwu.will.pojo.ReturnOrderDetail;
import com.madeofwu.will.service.GoodsService;
import com.madeofwu.will.service.ReturnOrderDetailService;
import com.madeofwu.will.service.ReturnOrderService;
import com.madeofwu.will.utils.DateUtil;
import com.madeofwu.will.utils.Msg;

@Controller
public class ReturnOrderDetailController {
	@Autowired
	private ReturnOrderService returnOrderService;
	@Autowired
	private ReturnOrderDetailService returnOrderDetailService;
	@Autowired
	private GoodsService goodsService;

	@ResponseBody
	@RequestMapping(value = "/detail/roUpdate", method = RequestMethod.POST)
	public String updateReturnOrderDetailBoId(ReturnOrderDetail returnOrderDetail,HttpServletRequest request,Model model) {
		String goodsName=returnOrderDetail.getGoodsName();
		String goodsType=returnOrderDetail.getGoodsType();
		String goodsColor=returnOrderDetail.getGoodsColor();
		int number=returnOrderDetail.getRodAmount();
		List<Goods> goods= goodsService.findBySomeNoProducer(goodsName, goodsType, goodsColor);
		if(goods!=null&&!goods.isEmpty()){
			Iterator it = goods.iterator();
			while(it.hasNext()){
				Goods g = (Goods) it.next();
				int goodsStore=g.getGoodsStore();
				int allamount=goodsStore-number;
				g.setGoodsStore(allamount);
				g.setGoodsUpdated(DateUtil.ChangeDateSecond());
				goodsService.update(g);
				returnOrderDetail.setGoodsId(g.getGoodsId());
				returnOrderDetailService.update(returnOrderDetail);
				model.addAttribute("rodId", returnOrderDetail.getRodId());
				return "/cue/successreturn";
			}
		}
		model.addAttribute("rodId", returnOrderDetail.getRodId());
		return "/cue/returnfail";
	}
	
	@ResponseBody
	@RequestMapping(value = "/detail/rodUpdate", method = RequestMethod.POST)
	public String updateReturnOrderDetailBodId(ReturnOrderDetail returnOrderDetail,HttpServletRequest request,Model model) {
		String goodsName=returnOrderDetail.getGoodsName();
		String goodsType=returnOrderDetail.getGoodsType();
		String goodsColor=returnOrderDetail.getGoodsColor();
		int number=returnOrderDetail.getRodAmount();
		List<Goods> goods= goodsService.findBySomeNoProducer(goodsName, goodsType, goodsColor);
		if(goods!=null&&!goods.isEmpty()){
			Iterator it = goods.iterator();
			while(it.hasNext()){
				Goods g = (Goods) it.next();
				int goodsStore=g.getGoodsStore();
				int allamount=goodsStore-number;
				g.setGoodsStore(allamount);
				g.setGoodsUpdated(DateUtil.ChangeDateSecond());
				goodsService.update(g);
				returnOrderDetail.setGoodsId(g.getGoodsId());
				returnOrderDetailService.update(returnOrderDetail);
				model.addAttribute("rodId", returnOrderDetail.getRodId());
				model.addAttribute("rodId", returnOrderDetail.getRodId());
				return "/cue/successreturn";
			}
		}
		model.addAttribute("rodId", returnOrderDetail.getRodId());
		return "/cue/returnfail";
	}
	
	@RequestMapping("/returnOrderDetail/ros")
	@ResponseBody
	public Msg getReturnOrderDetailWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<ReturnOrderDetail> ros = returnOrderDetailService.getAll();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(ros, 5);
		return Msg.success().add("pageInfo", page);
	}
	@RequestMapping("/returnOrderDetail/Detaillist")
	public String List() {
		return "/returnOrderDetail/Detaillist";
	}
	
	@RequestMapping("/returnOrderDetail/OneDetaillist")
	public String getSelectReturnOrderDetail(@RequestParam("search") String search,
			Model model) {
		ReturnOrderDetail returnOrderDetail = new ReturnOrderDetail();
		returnOrderDetail = returnOrderDetailService.findByRodId(search);
		if (returnOrderDetail != null) {
			String roId = returnOrderDetail.getRoId();
			model.addAttribute("roId", roId);
			return "/returnOrderDetail/OneDetaillist";
		}
		return "/cue/404";
	}
	@RequestMapping(value = "/returnOrderDetail/ro/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getOneDetailAll(@PathVariable("id") String id,
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 1);
		List<ReturnOrderDetail> returnOrderDetail=returnOrderDetailService.findByRoId(id);
		PageInfo page = new PageInfo(returnOrderDetail,1);
		return Msg.success().add("pageInfo", page);
	}
}
