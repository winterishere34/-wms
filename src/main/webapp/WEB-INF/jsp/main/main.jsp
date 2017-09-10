<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="proPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>进销存管理中心</title>  
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>   
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1>进销存管理中心</h1>
  </div>
  <div class="head-l">
  <a class="button button-little bg-green" href="${proPath}/main/main" target="_blank">
  <span class="icon-home"></span> 首页</a> &nbsp;&nbsp;
  
  <a class="button button-little bg-red" href="login.jsp">
  <span class="icon-power-off"></span> 退出登录</a> 
  
  
  </div>
 
</div>


<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
  <h2><span class="icon-user"></span>基本设置</h2>
  <ul style="display:block">
  
    <li><a href="${proPath}/supplier/supplierlist" target="right"><span class="icon-caret-right"></span>供货商查询</a></li>
 
    <li><a href="${proPath}/storehouse/storehouselist" target="right"><span class="icon-caret-right"></span>仓库查看</a></li>
    
    <li><a href="${proPath}/goods/goodslist" target="right"><span class="icon-caret-right"></span>商品查看</a></li>
    
  </ul>   
  <h2><span class="icon-pencil-square-o"></span>进销查询</h2>
  <ul>
    <li><a href="${proPath}/buyOrder/buyOrderlist" target="right"><span class="icon-caret-right"></span>进货查看</a></li>
    
    <li><a href="${proPath}/returnOrder/returnOrderlist" target="right"><span class="icon-caret-right"></span>退货查看</a></li>
    
    <li><a href="${proPath}/accountRecords/accountRecordslist" target="right"><span class="icon-caret-right"></span>订单查看</a></li>
    
           
  </ul> 
  <h2><span class="icon-pencil-square-o"></span>明细查询</h2>
  <ul>
    <li><a href="${proPath}/detail/search" target="right"><span class="icon-caret-right"></span>明细查找</a></li>
    
    <li><a href="${proPath}/buyOrderDetail/Detaillist" target="right"><span class="icon-caret-right"></span>所有进货明细查看</a></li>
    
    <li><a href="${proPath}/returnOrderDetail/Detaillist" target="right"><span class="icon-caret-right"></span>所有退货明细查看</a></li>
  </ul>
    <h2><span class="icon-pencil-square-o"></span>订单业务</h2>
  <ul>
    <li><a href="${proPath}/subscriber/search" target="right"><span class="icon-caret-right"></span>订单查找</a></li>
    
  </ul>
</div>
<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
});
</script>
<ul class="bread" >
  <li><b>当前语言：</b><span style="color:red;">中文</php></span> </li>
</ul>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="images/welcome.jpg" name="right" width="100%" height="100%"></iframe>
</div>
<div style="text-align:center">
</div>
</body>
</html>