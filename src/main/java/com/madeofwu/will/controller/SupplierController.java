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
import com.madeofwu.will.pojo.Supplier;
import com.madeofwu.will.service.SupplierService;
import com.madeofwu.will.utils.Msg;

@Controller
public class SupplierController {
	@Autowired
	private SupplierService supplierService;
    
	@RequestMapping("/supplier/supplierlist")
	 public String List(){
        return "/supplier/supplierlist";
    }

	@RequestMapping("/supplier/sups")
	@ResponseBody
	public Msg getSupplierWithJson(@RequestParam(value = "pn", defaultValue = "1") Integer pn) {
		// 在查询之前只需要调用，传入页码，以及每页的大小
		PageHelper.startPage(pn, 5);
		// startPage后面紧跟的这个查询就是一个分页查询
		List<Supplier> sups = supplierService.getAll();
		// 使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了。
		// 封装了详细的分页信息,包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page = new PageInfo(sups, 5);
		return Msg.success().add("pageInfo", page);
	}
	
	@RequestMapping(value="/supplier/insert",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveSupplier(@Valid Supplier supplier,BindingResult result){
		if(result.hasErrors()){
			//校验失败，应该返回失败，在模态框中显示校验失败的错误信息
			Map<String, Object> map = new HashMap<>();
			List<FieldError> errors = result.getFieldErrors();
			for (FieldError fieldError : errors) {
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
			}
			return Msg.fail().add("errorFields", map);
		}else{
			supplierService.insert(supplier);
			return Msg.success();
		}
		
	}
	@ResponseBody
	@RequestMapping(value="/supplier/update/{supId}",method=RequestMethod.POST)
	public Msg updateSupplier(Supplier supplier,HttpServletRequest request){
		System.out.println("将要更新的数据："+supplier);
		supplierService.update(supplier);
		return Msg.success();
	}
	@RequestMapping(value="/supplier/select/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getSupplier(@PathVariable("id")Integer id){
		
		Supplier supplier = supplierService.findById(id);
		return Msg.success().add("supplier", supplier);
	}
	
	@ResponseBody
	@RequestMapping(value="/supplier/delete/{ids}",method=RequestMethod.DELETE)
	public Msg deleteSupplier(@PathVariable("ids")String ids){
		//批量删除
		if(ids.contains("-")){
			List<Integer> del_ids = new ArrayList<>();
			String[] str_ids = ids.split("-");
			//组装id的集合
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			supplierService.deleteBatch(del_ids);
		}else{
			Integer id = Integer.parseInt(ids);
			supplierService.delete(id);
		}
		return Msg.success();
	}
	
	@RequestMapping("/goods/suppliers")
	@ResponseBody
	public Msg getSuppliers() {
		// 查出的所有供应商信息
		List<Supplier> list = supplierService.getSuppliers();
		return Msg.success().add("suppliers", list);
	}
}
