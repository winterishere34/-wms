package com.madeofwu.will.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.madeofwu.will.pojo.TUser;
import com.madeofwu.will.service.UserService;
import com.madeofwu.will.utils.Msg;

@Controller
public class UserController {
@Autowired
private UserService userService;

@RequestMapping("/user/users")
@ResponseBody
public Msg getUsers() {
	// 查出的所有部门信息
	List<TUser> list = userService.getUsers();
	return Msg.success().add("users", list);
}
}
