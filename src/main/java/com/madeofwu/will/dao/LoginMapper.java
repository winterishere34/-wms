package com.madeofwu.will.dao;

import java.util.Set;

import com.madeofwu.will.pojo.TUser;

public interface LoginMapper {
	public TUser getByUsername(String username);  
	  
    public Set<String> getRoles(String username);  
  
    public Set<String> getPermissions(String username); 
}