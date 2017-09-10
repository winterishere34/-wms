package com.madeofwu.will.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.madeofwu.will.pojo.StoreHouseType;
import com.madeofwu.will.service.StoreHouseTypeService;
import com.madeofwu.will.utils.Msg;

@Controller
public class StoreHouseTypeController {
	@Autowired
	private StoreHouseTypeService storeHouseTypeService;

	@RequestMapping("/storeHouseType/types")
	@ResponseBody
	public Msg getTypes() {
		// 查出的所有部门信息
		List<StoreHouseType> list = storeHouseTypeService.getTypes();
		return Msg.success().add("types", list);
	}
}
