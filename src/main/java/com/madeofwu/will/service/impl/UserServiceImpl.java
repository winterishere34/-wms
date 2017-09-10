package com.madeofwu.will.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.will.dao.TUserMapper;
import com.madeofwu.will.pojo.SupplierType;
import com.madeofwu.will.pojo.TUser;
import com.madeofwu.will.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TUserMapper userMapper;
	@Override
	public List<TUser> getUsers() {
		// TODO Auto-generated method stub
		List<TUser> list = userMapper.selectByExample(null);
		return list;
	}

}
