package com.madeofwu.will.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.madeofwu.will.pojo.Goods;
import com.madeofwu.will.service.GoodsService;
import com.madeofwu.will.utils.Msg;

@Controller
@RequestMapping("/goods")
public class GoodsController {
	@Autowired
	private GoodsService goodsService;

	@RequestMapping("/goodslist")
	public String List() {
		return "/goods/goodslist";
	}

	@RequestMapping("/goodss")
	@ResponseBody
	public Msg getGoodsWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Goods> goods = goodsService.getAll();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(goods, 5);
		return Msg.success().add("pageInfo", page);
	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	@ResponseBody
	public Msg saveGoods(@Valid Goods goods, BindingResult result) {
		if (result.hasErrors()) {
			// 校验失败，应该返回失败，在模态框中显示校验失败的错误信息
			Map<String, Object> map = new HashMap<>();
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		} else {
			goodsService.insert(goods);
			return Msg.success();
		}

	}

	@ResponseBody
	@RequestMapping(value = "/update/{goodsId}", method = RequestMethod.POST)
	public Msg updateGoods(Goods goods, HttpServletRequest request) {
		System.out.println("将要更新的数据：" + goods);
		goodsService.update(goods);
		return Msg.success();
	}

	@RequestMapping(value = "/select/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getGoods(@PathVariable("id") String id) {

		Goods goods = goodsService.findById(id);
		return Msg.success().add("goods", goods);
	}

	@ResponseBody
	@RequestMapping(value = "/delete/{ids}", method = RequestMethod.DELETE)
	public Msg deleteSupplier(@PathVariable("ids") String ids) {
		// 批量删除
		if (ids.contains(",")) {
			List<String> del_ids = new ArrayList<>();
			String[] str_ids = ids.split(",");
			// 组装id的集合
			for (String string : str_ids) {
				del_ids.add(string);
			}
			goodsService.deleteBatch(del_ids);
		} else {
			String id = ids;
			goodsService.delete(id);
		}
		return Msg.success();
	}
}
