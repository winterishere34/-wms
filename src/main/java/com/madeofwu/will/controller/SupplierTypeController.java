package com.madeofwu.will.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.madeofwu.will.pojo.SupplierType;
import com.madeofwu.will.service.SupplierTypeService;
import com.madeofwu.will.utils.Msg;

@Controller
public class SupplierTypeController {
	@Autowired
	private SupplierTypeService supplierTypeService;

	@RequestMapping("/supplierType/types")
	@ResponseBody
	public Msg getTypes() {
		// 查出的所有部门信息
		List<SupplierType> list = supplierTypeService.getTypes();
		return Msg.success().add("types", list);
	}
}
