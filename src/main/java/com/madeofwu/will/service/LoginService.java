package com.madeofwu.will.service;

import java.util.Set;

import com.madeofwu.will.pojo.TUser;

public interface LoginService {
	public TUser getByUsername(String username);

	public Set<String> getRoles(String username);

	public Set<String> getPermissions(String username);
}
