package com.madeofwu.will.utils;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

public class MD5Util {
	
	public static void main(String[] args) {  
	    String algorithmName = "md5";  
	    String username = "q3877411";  
	    String password = "123";  
	    String salt1 = username;  
	    String salt2 = new SecureRandomNumberGenerator().nextBytes().toHex();  
	    int hashIterations = 3;  
	    SimpleHash hash = new SimpleHash(algorithmName, password,  
	            salt1 + salt2, hashIterations);  
	    String encodedPassword = hash.toHex();  
	    System.out.println(encodedPassword);  
	    System.out.println(salt2);  
	} 

}
