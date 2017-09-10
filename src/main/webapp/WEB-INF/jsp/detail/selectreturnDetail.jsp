<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="proPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="${proPath}/css/pintuer.css">
<link rel="stylesheet" href="${proPath}/css/admin.css">
<script src="${proPath}/js/jquery.js"></script>
<script src="${proPath}/js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>退货明细单</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="${proPath}/detail/rodUpdate">  
      <div class="form-group">
        <div class="label">
          <label>明细单号：</label>
        </div>
        <div class="field">
          <input type="text" class="input" value="${rodId}" name="rodId" id="rodId_update_input" readonly="readonly"/>
          <div class="tips"></div>
        </div>
         <div class="label">
          <label>商品名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  name="goodsName" id="goodsName_update_input" placeholder="请输入商品名称"/>
          <div class="tips"></div>
        </div>
         <div class="label">
          <label>商品单位：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50"  name="goodsUnit" id="goodsUnit_update_input" placeholder="请输入商品单位" />
          <div class="tips"></div>
        </div>
         <div class="label">
          <label>商品类型：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="goodsType" id="goodsType_update_input" placeholder="请输入商品类型" />
          <div class="tips"></div>
        </div>
         <div class="label">
          <label>颜色：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="goodsColor" id="goodsColor_update_input" placeholder="请输入颜色" />
          <div class="tips"></div>
        </div>
         <div class="label">
          <label>数量：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="rodAmount" id="rodAmount_update_input" placeholder="请输入数量" />
          <div class="tips"></div>
        </div>
         <div class="label">
          <label>进价：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="rodBuyPrice" id="rodBuyPrice_update_input" placeholder="请输入进价" />
          <div class="tips"></div>
        </div>
         <div class="label">
          <label>总金额：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" name="rodTotalPrice" id="rodTotalPrice_update_input" placeholder="请输入颜色" />
          <div class="tips"></div>
        </div>
         <div class="label">
          <label>订单号：</label>
        </div>
        <div class="field">
          <input type="text" class="input" name="roId" value="${roId}" id="roId_update_input" readonly="readonly" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
        </div>
      </div>
    </form>
  </div>
</div>
<script type="text/javascript">








</script>
</body></html>