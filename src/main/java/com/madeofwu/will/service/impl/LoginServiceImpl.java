package com.madeofwu.will.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madeofwu.will.dao.LoginMapper;
import com.madeofwu.will.pojo.TUser;
import com.madeofwu.will.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginMapper loginMapper;
	@Override
	public TUser getByUsername(String username) {
		// TODO Auto-generated method stub
		return loginMapper.getByUsername(username);
	}

	@Override
	public Set<String> getRoles(String username) {
		// TODO Auto-generated method stub
		return loginMapper.getRoles(username);
	}

	@Override
	public Set<String> getPermissions(String username) {
		// TODO Auto-generated method stub
		return loginMapper.getPermissions(username);
	}

}
