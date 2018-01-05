package com.madeofwu.will.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.madeofwu.will.pojo.AccountRecords;
import com.madeofwu.will.pojo.BuyOrderDetail;
import com.madeofwu.will.pojo.Goods;
import com.madeofwu.will.service.AccountRecordsService;
import com.madeofwu.will.service.GoodsService;
import com.madeofwu.will.utils.DateUtil;
import com.madeofwu.will.utils.Msg;

@Controller
public class AccountRecordsController {

	@Autowired
	private AccountRecordsService accountRecordsService;
	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("/accountRecords/accountRecordslist")
	public String List() {
		return "/accountRecords/accountRecordslist";
	}

	@RequestMapping("/accountRecords/ars")
	@ResponseBody
	public Msg getAccountRecordsWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<AccountRecords> ars = accountRecordsService.getAll();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(ars, 5);
		return Msg.success().add("pageInfo", page);
	}

	@RequestMapping(value = "/accountRecords/insert", method = RequestMethod.POST)
	@ResponseBody
	public Msg saveAccountRecords(@Valid AccountRecords accountRecords, BindingResult result,Model model) {
		if (result.hasErrors()) {
			// 校验失败，应该返回失败，在模态框中显示校验失败的错误信息
			Map<String, Object> map = new HashMap<>();
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		} else {
			String goodsName=accountRecords.getGoodsName();
			String goodsType=accountRecords.getGoodsType();
			String goodsColor=accountRecords.getGoodsColor();
			List<Goods> goods = goodsService.findBySomeNoProducer(goodsName, goodsType, goodsColor);
			if(goods!=null&&!goods.isEmpty()){
				Iterator it = goods.iterator();
				while(it.hasNext()){
					Goods g = (Goods) it.next(); 
					accountRecords.setShId(g.getGoodsStoreId());
					accountRecords.setSupId(g.getGoodsSupplierId());
					accountRecords.setGoodsId(g.getGoodsId());
					accountRecords.setGoodsUnit(g.getGoodsUnit());
					accountRecords.setArPrice(g.getGoodsSelPrice());
					String arId=accountRecordsService.insert(accountRecords);
					int number=accountRecords.getArAmount();
					int store=g.getGoodsStore();
					int allnumber= store-number;
					g.setGoodsStore(allnumber);
					goodsService.update(g);
					return Msg.success().add("arId", arId);
				}
			}
			return Msg.fail();
		}
	}

	@ResponseBody
	@RequestMapping(value = "/accountRecords/update/{arId}", method = RequestMethod.POST)
	public Msg updateAccountRecords(AccountRecords accountRecords,HttpServletRequest request) {
		accountRecordsService.update(accountRecords);
		return Msg.success();
	}

	@RequestMapping(value = "/accountRecords/select/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getAccountRecords(@PathVariable("id") String id) {

		AccountRecords accountRecords = accountRecordsService.findById(id);
		return Msg.success().add("accountRecords", accountRecords);
	}

	@ResponseBody
	@RequestMapping(value = "/accountRecords/delete/{ids}", method = RequestMethod.DELETE)
	public Msg deleteAccountRecords(@PathVariable("ids") String ids) {
		// 批量删除
		if (ids.contains(",")) {
			List<String> del_ids = new ArrayList<>();
			String[] str_ids = ids.split(",");
			// 组装id的集合
			for (String string : str_ids) {
				del_ids.add(string);
			}
			accountRecordsService.deleteBatch(del_ids);
		} else {
			String id = ids;
			accountRecordsService.delete(id);
		}
		return Msg.success();
	}
	
	
	@RequestMapping(value = "/accountRecords/ar/{arId}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getOneDetailAll(@PathVariable("arId") String arId,
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 1);
		List<AccountRecords> accountRecords=accountRecordsService.getAccountRecords(arId);
		PageInfo page = new PageInfo(accountRecords,1);
		return Msg.success().add("pageInfo", page);
	}
	
	@RequestMapping(value = "/accountRecords/ar/s", method = RequestMethod.GET)
	@ResponseBody
	public Msg getOneDetailssssss(@PathVariable("arId") String arId,
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		PageHelper.startPage(pn, 1);
		List<AccountRecords> accountRecords=accountRecordsService.getAccountRecords(arId);
		PageInfo page = new PageInfo(accountRecords,1);
		return Msg.success().add("pageInfo", page);
	}
	

}
