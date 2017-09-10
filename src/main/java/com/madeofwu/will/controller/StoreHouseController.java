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
import com.madeofwu.will.pojo.StoreHouse;
import com.madeofwu.will.service.StoreHouseService;
import com.madeofwu.will.utils.Msg;

@Controller
public class StoreHouseController {
	@Autowired
	private StoreHouseService storeHouseService;
	
	@RequestMapping("/storehouse/storehouselist")
	 public String List(){
       return "/storehouse/storehouselist";
   }
	
	@RequestMapping("/storehouse/shs")
	@ResponseBody
	public Msg getStoreHouseWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<StoreHouse> shs = storeHouseService.getAll();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(shs, 5);
		return Msg.success().add("pageInfo", page);
	}
	
	@RequestMapping(value="/storehouse/insert",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveStoreHouse(@Valid StoreHouse storeHouse,BindingResult result){
		if(result.hasErrors()){
			//校验失败，应该返回失败，在模态框中显示校验失败的错误信息
			Map<String, Object> map = new HashMap<>();
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		}else{
			storeHouseService.insert(storeHouse);
			return Msg.success();
		}
	}
	
	@ResponseBody
	@RequestMapping(value="/storehouse/update/{shId}",method=RequestMethod.POST)
	public Msg updateStoreHouse(StoreHouse storeHouse,HttpServletRequest request){
		System.out.println("将要更新的数据："+storeHouse);
		storeHouseService.update(storeHouse);
		return Msg.success();
	}
	
	@RequestMapping(value="/storehouse/select/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getStoreHouse(@PathVariable("id")Integer id){
		
		StoreHouse storeHouse = storeHouseService.findById(id);
		return Msg.success().add("storeHouse", storeHouse);
	}
	
	@ResponseBody
	@RequestMapping(value="/storehouse/delete/{ids}",method=RequestMethod.DELETE)
	public Msg deleteStoreHouse(@PathVariable("ids")String ids){
		//批量删除
		if(ids.contains("-")){
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id的集合
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			storeHouseService.deleteBatch(del_ids);
		}else{
			Integer id = Integer.parseInt(ids);
			storeHouseService.delete(id);
		}
		return Msg.success();
	}
	
	@RequestMapping("/goods/storeHouses")
	@ResponseBody
	public Msg getStorehouses() {
		// 查出的所有供应商信息
		List<StoreHouse> list = storeHouseService.getStoreHouses();
		return Msg.success().add("storeHouses", list);
	}
}
