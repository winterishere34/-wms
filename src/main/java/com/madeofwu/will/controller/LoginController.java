package com.madeofwu.will.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.madeofwu.will.pojo.TUser;
import com.madeofwu.will.service.LoginService;
@Controller
public class LoginController {
@Autowired
private LoginService loginService;

@RequestMapping("/login") 
public String login(TUser user,HttpServletRequest request){
	Subject subject = SecurityUtils.getSubject() ; 
	UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword()) ; 
	String error = null;
	 try {
         subject.login(token);
     } catch (UnknownAccountException e) {
         error = "用户名/密码错误";
     } catch (IncorrectCredentialsException e) {
         error = "用户名/密码错误";
     } catch (ExcessiveAttemptsException e) {
         // TODO: handle exception
         error = "登录失败多次，账户锁定10分钟";
     } catch (AuthenticationException e) {
         // 其他错误，比如锁定，如果想单独处理请单独catch处理
         error = "其他错误：" + e.getMessage();
     }
     if (error != null) {// 出错了，返回登录页面
         request.setAttribute("error", error);
         return "/login";
     } else {// 登录成功
         return "/main/main";
     }

	}
@RequestMapping("/logout")
public String logout(HttpServletRequest request){  
    request.getSession().invalidate();  
    return "login";  
}
}
