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
import com.madeofwu.will.pojo.BuyOrderDetail;
import com.madeofwu.will.service.BuyOrderDetailService;
import com.madeofwu.will.service.BuyOrderService;
import com.madeofwu.will.utils.Msg;

@Controller
public class BuyOrderController {
	@Autowired
	private BuyOrderService buyOrderService;
	@Autowired
	private BuyOrderDetailService buyOrderDetailService;

	@RequestMapping("/buyOrder/buyOrderlist")
	public String List() {
		return "/buyOrder/buyOrderlist";
	}

	@RequestMapping("/buyOrder/bos")
	@ResponseBody
	public Msg getBuyOrderWithJson(
			@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<BuyOrder> bos = buyOrderService.getAll();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(bos, 5);
		return Msg.success().add("pageInfo", page);
	}

	@RequestMapping(value = "/buyOrder/insert", method = RequestMethod.POST)
	@ResponseBody
	public Msg saveBuyOrder(@Valid BuyOrder buyOrder, BindingResult result) {
		if (result.hasErrors()) {
			// 校验失败，应该返回失败，在模态框中显示校验失败的错误信息
			Map<String, Object> map = new HashMap<>();
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		} else {
			String BoId=buyOrderService.insert(buyOrder);
			return Msg.success().add("BoId", BoId);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/buyOrder/update/{boId}", method = RequestMethod.POST)
	public Msg updateBuyOrder(BuyOrder buyOrder,HttpServletRequest request) {
		System.out.println("将要更新的数据：" + buyOrder);
		buyOrderService.update(buyOrder);
		return Msg.success();
	}

	@RequestMapping(value = "/buyOrder/select/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Msg getBuyOrder(@PathVariable("id") String id) {

		BuyOrder buyOrder = buyOrderService.findById(id);
		return Msg.success().add("buyOrder", buyOrder);
	}

	@ResponseBody
	@RequestMapping(value = "/buyOrder/delete/{ids}", method = RequestMethod.DELETE)
	public Msg deleteBuyOrder(@PathVariable("ids") String ids) {
		// 批量删除
		if (ids.contains(",")) {
			List<String> del_ids = new ArrayList<>();
			String[] str_ids = ids.split(",");
			// 组装id的集合
			for (String string : str_ids) {
				del_ids.add(string);
			}
			buyOrderService.deleteBatch(del_ids);
			buyOrderDetailService.deleteBatch(del_ids);
		} else {
			String id = ids;
			buyOrderService.delete(id);
			buyOrderDetailService.delete(id);
		}
		return Msg.success();
	}

}
