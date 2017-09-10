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
import com.madeofwu.will.pojo.BuyOrder;
import com.madeofwu.will.pojo.ReturnOrder;
import com.madeofwu.will.service.ReturnOrderDetailService;
import com.madeofwu.will.service.ReturnOrderService;
import com.madeofwu.will.utils.Msg;

@Controller
public class ReturnOrderController {
	@Autowired
	private ReturnOrderService returnOrderService;
	@Autowired
	private ReturnOrderDetailService returnOrderDetailService;
	
	@RequestMapping("/returnOrder/returnOrderlist")
	public String List() {
		return "/returnOrder/returnOrderlist";
	}

	@RequestMapping("/returnOrder/ros")
	@ResponseBody
	public Msg getReturnOrderWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<ReturnOrder> bos = returnOrderService.getAll();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(bos, 5);
		return Msg.success().add("pageInfo", page);
	}

	@RequestMapping(value = "/returnOrder/insert", method = RequestMethod.POST)
	@ResponseBody
	public Msg saveReturnOrder(@Valid ReturnOrder returnOrder, BindingResult result) {
		if (result.hasErrors()) {
			// 校验失败，应该返回失败，在模态框中显示校验失败的错误信息
			Map<String, Object> map = new HashMap<>();
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		} else {
			String RoId=returnOrderService.insert(returnOrder);
			return Msg.success().add("RoId", RoId);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/returnOrder/update/{roId}", method = RequestMethod.POST)
	public Msg updateReturnOrder(ReturnOrder returnOrder,HttpServletRequest request) {
		returnOrderService.update(returnOrder);
		return Msg.success();
	}

	@RequestMapping(value = "/returnOrder/select/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getReturnOrder(@PathVariable("id") String id) {

		ReturnOrder returnOrder = returnOrderService.findById(id);
		return Msg.success().add("returnOrder", returnOrder);
	}

	@ResponseBody
	@RequestMapping(value = "/returnOrder/delete/{ids}", method = RequestMethod.DELETE)
	public Msg deleteReturnOrder(@PathVariable("ids") String ids) {
		// 批量删除
		if (ids.contains(",")) {
			List<String> del_ids = new ArrayList<>();
			String[] str_ids = ids.split(",");
			// 组装id的集合
			for (String string : str_ids) {
				del_ids.add(string);
			}
			returnOrderService.deleteBatch(del_ids);
			returnOrderDetailService.deleteBatch(del_ids);
		} else {
			String id = ids;
			returnOrderService.delete(id);
			returnOrderDetailService.delete(id);
		}
		return Msg.success();
	}

	@RequestMapping("/detail/returnOrders")
	@ResponseBody
	public Msg getReturnOrder() {
		// 查出的所有供应商信息
		List<ReturnOrder> list = returnOrderService.getReturnOrder();
		return Msg.success().add("returnOrders", list);
	}
}
