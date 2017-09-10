package com.madeofwu.will.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.madeofwu.will.pojo.AccountRecords;
import com.madeofwu.will.pojo.BuyOrderDetail;
import com.madeofwu.will.pojo.ReturnOrderDetail;
import com.madeofwu.will.service.AccountRecordsService;
import com.madeofwu.will.service.BuyOrderDetailService;
import com.madeofwu.will.service.ReturnOrderDetailService;

@Controller
public class SearchController {

	@Autowired
	private BuyOrderDetailService buyOrderDetailService;
	@Autowired
	private ReturnOrderDetailService returnOrderDetailService;
	@Autowired
	private AccountRecordsService accountRecordsService;

	@RequestMapping("/detail/search")
	public String getSearch() {
		return "/detail/search";
	}
	
	@RequestMapping("/subscriber/search")
	public String getSubscrberSearch() {
		return "/subscriber/search";
	}

	@RequestMapping("/detail/selectBuyDetail")
	public String getSelectBuyDetail(@RequestParam("search") String search,
			Model model) {
		BuyOrderDetail buyOrderDetail = new BuyOrderDetail();
		buyOrderDetail = buyOrderDetailService.findByBodId(search);
		if (buyOrderDetail != null) {
			String boId = buyOrderDetail.getBoId();
			String bodId = buyOrderDetail.getBodId();
			model.addAttribute("boId", boId);
			model.addAttribute("bodId", bodId);
			return "/detail/selectbuyDetail";
		}
		return "/cue/404";
	}

	@RequestMapping("/detail/buyOrderDetail")
	public String getBuyOrderDetail(@RequestParam("search") String search,
			Model model) {
		List<BuyOrderDetail> buyOrderDetail = buyOrderDetailService
				.findByBoId(search);
		if (buyOrderDetail != null&&!buyOrderDetail.isEmpty()) {
			Iterator it = buyOrderDetail.iterator();
			while (it.hasNext()) {
				BuyOrderDetail bo = (BuyOrderDetail) it.next();
				String boId = bo.getBoId();
				String bodId = bo.getBodId();
				model.addAttribute("boId", boId);
				model.addAttribute("bodId", bodId);
			}
			return "/detail/buyOrderDetail";
		}
		return "/cue/404";
	}

	@RequestMapping("/detail/returnOrderDetail")
	public String getReturnOrderDetail(@RequestParam("search") String search,
			Model model) {
		List<ReturnOrderDetail> returnOrderDetail = returnOrderDetailService
				.findByRoId(search);
		if (returnOrderDetail != null&&!returnOrderDetail.isEmpty()) {
			Iterator it = returnOrderDetail.iterator();
			while (it.hasNext()) {
				ReturnOrderDetail ro = (ReturnOrderDetail) it.next();
				String roId = ro.getRoId();
				String rodId = ro.getRodId();
				model.addAttribute("roId", roId);
				model.addAttribute("rodId", rodId);
			}
			return "/detail/returnOrderDetail";
		}
		return "/cue/404";
	}

	@RequestMapping("/detail/selectReturnDetail")
	public String getSelectReturnDetail(
			@RequestParam("search") String search, Model model) {
		ReturnOrderDetail returnOrderDetail = new ReturnOrderDetail();
		returnOrderDetail = returnOrderDetailService.findByRodId(search);
		if (returnOrderDetail != null) {
			String roId = returnOrderDetail.getRoId();
			String rodId = returnOrderDetail.getRodId();
			model.addAttribute("roId", roId);
			model.addAttribute("rodId", rodId);
			return "/detail/selectreturnDetail";
		}
		return "/cue/404";
	}
	@RequestMapping("/subscriber/OneDetaillist")
	public String getAccountRecordsDetail(
			@RequestParam("search") String search, Model model) {
		AccountRecords accountRecords=new AccountRecords();
		accountRecords=accountRecordsService.findById(search);
		if (accountRecords != null) {
			model.addAttribute("arId",accountRecords.getArId());
			return "/subscriber/OneDetaillist";
		}
		return "/cue/AccountRecordsfail";
	}
	
}
