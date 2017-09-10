<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>员工列表</title>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!-- web路径：
不以/开始的相对路径，找资源，以当前资源的路径为基准，经常容易出问题。
以/开始的相对路径，找资源，以服务器的路径为标准(http://localhost:3306)；需要加上项目名
		http://localhost:3306/crud
 -->
<script type="text/javascript"
	src="${APP_PATH }/js/jquery-1.12.4.min.js"></script>
<link
	href="${APP_PATH }/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH }/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<%
java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-MM-dd");  
java.util.Date currentTime = new java.util.Date();  
String time = simpleDateFormat.format(currentTime).toString();   //放到页面的head中
%>
<!-- 进货修改的模态框 -->
<div class="modal fade" id="accountRecordsUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">订单修改</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
        <div class="form-group">
		    <label class="col-sm-2 control-label">订单号</label>
		    <div class="col-sm-10">
		      <input type="text" name="arId" class="form-control" id="arId_update_input" readonly="readonly">
		      <span class="help-block"></span>
		    </div>
		  </div>
         <div class="form-group">
		    <label class="col-sm-2 control-label">仓库</label>
		    <div class="col-sm-4">
		    	<!-- 部门提交部门id即可 -->
		      <select id="select_storeHouse" class="form-control" name="shId" readonly="readonly">
		      </select>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">供应商</label>
		    <div class="col-sm-4">
		    	<!-- 部门提交部门id即可 -->
		      <select id="select_supplier" class="form-control" name="supId" readonly="readonly">
		      </select>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">订单日期</label>
		    <div class="col-sm-10">
		      <input type="text" name="arDate" class="form-control" id="arDate_update_input" readonly="readonly">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">商品编号</label>
		    <div class="col-sm-10">
		      	 <input type="text" name="goodsId" class="form-control" id="goodsId_update_input" readonly="readonly">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">商品名</label>
		    <div class="col-sm-10">
		      <input type="text" name="goodsName" class="form-control" id="goodsName_update_input" readonly="readonly">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">单位</label>
		    <div class="col-sm-10">
		      <input type="text" name="goodsUnit" class="form-control" id="goodsUnit_update_input" readonly="readonly">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">类型</label>
		    <div class="col-sm-10">
		      <input type="text" name="goodsType" class="form-control" id="goodsType_update_input" readonly="readonly">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">颜色</label>
		    <div class="col-sm-10">
		      <input type="text" name="goodsColor" class="form-control" id="goodsColor_update_input" readonly="readonly">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">数量</label>
		    <div class="col-sm-10">
		      <input type="text" name="arAmount" class="form-control" id="arAmount_update_input" >
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">单价</label>
		    <div class="col-sm-10">
		      <input type="text" name="arPrice" class="form-control" id="arPrice_update_input" readonly="readonly">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">应付</label>
		    <div class="col-sm-10">
		      <input type="text" name="arPayable" class="form-control" id="arPayable_update_input" >
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">实付</label>
		    <div class="col-sm-10">
		      <input type="text" name="arPaid" class="form-control" id="arPaid_update_input" >
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">欠款</label>
		    <div class="col-sm-10">
		      <input type="text" name="arArrears" class="form-control" id="arArrears_update_input" >
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">优惠金额</label>
		    <div class="col-sm-10">
		      <input type="text" name="arDiscount" class="form-control" id="arDiscount_update_input" >
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">经办人</label>
		    <div class="col-sm-10">
		      <input type="text" name="arAttn" class="form-control" id="arAttn_update_input" readonly="readonly">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">操作员</label>
		    <div class="col-sm-4">
		    	<!-- 部门提交部门id即可 -->
		      <select id="select_user" class="form-control" name="arOperator" readonly="readonly">
		      </select>
		    </div>
		  </div>
		 <div class="form-group">
		    <label class="col-sm-2 control-label">备注</label>
		    <div class="col-sm-10">
		      <input type="text" name="arRemark" class="form-control" id="arRemark_update_input" >
		      <span class="help-block"></span>
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="accountRecords_update_btn">更新</button>
      </div>
    </div>
  </div>
</div>



<!-- 商品添加的模态框 -->
<div class="modal fade" id="accountRecordsAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">订单添加</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
        
		  <div class="form-group">
		    <label class="col-sm-2 control-label">订货日期</label>
		    <div class="col-sm-10">
		      <input type="text" name="arDate" class="form-control" id="arDate_add_input" value="<%=time%>" readonly="readonly" placeholder="<%=time%>">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">商品名</label>
		    <div class="col-sm-10">
		    <input type="text" name="goodsName" class="form-control" id="goodsName_add_input" placeholder="请输入商品名">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">类型</label>
		    <div class="col-sm-10">
		    <input type="text" name="goodsType" class="form-control" id="goodsType_add_input" placeholder="请输入类型">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">颜色</label>
		    <div class="col-sm-10">
		    <input type="text" name="goodsColor" class="form-control" id="goodsColor_add_input" placeholder="请输入颜色">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">数量</label>
		    <div class="col-sm-10">
		    <input type="text" name="arAmount" class="form-control" id="arAmount_add_input" placeholder="请输入数量">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">应付</label>
		    <div class="col-sm-10">
		    <input type="text" name="arPayable" class="form-control" id="arPayable_add_input" placeholder="请输入应付">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">实付</label>
		    <div class="col-sm-10">
		    <input type="text" name="arPaid" class="form-control" id="arPaid_add_input" placeholder="请输入实付">
		      <span class="help-block"></span>
		    </div>
		  </div> 
		  <div class="form-group">
		    <label class="col-sm-2 control-label">欠款</label>
		    <div class="col-sm-10">
		    <input type="text" name="arArrears" class="form-control" id="arArrears_add_input" placeholder="请输入欠款">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">优惠金额</label>
		    <div class="col-sm-10">
		    <input type="text" name="arDiscount" class="form-control" id="arDiscount_add_input" placeholder="请输入欠款">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">备注</label>
		    <div class="col-sm-10">
		    <input type="text" name="arRemark" class="form-control" id="arRemark_add_input" placeholder="请输入备注">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">经办人</label>
		    <div class="col-sm-10">
		    <input type="text" name="arAttn" class="form-control" id="arAttn_add_input" placeholder="请输入经办人">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">操作员</label>
		    <div class="col-sm-4">
		    	<!-- 部门提交部门id即可 -->
		      <select id="select_user" class="form-control" name="arOperator">
		      </select>
		    </div>
		  </div>
		 
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="accountRecords_save_btn">保存</button>
      </div>
    </div>
  </div>
</div>


	<!-- 搭建显示页面 -->
	<div class="container">
	<!-- 按钮 -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
			<shiro:hasAnyRoles name="admin,manager,user">
				<button class="btn btn-primary" id="accountRecords_add_modal_btn">新增</button>
			</shiro:hasAnyRoles>
			<shiro:hasAnyRoles name="admin">
				<button class="btn btn-danger" id="accountRecords_delete_all_btn">删除</button>
			</shiro:hasAnyRoles>
			</div>
		</div>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="ars_table">
					<thead>
						<tr>
							<th>
								<input type="checkbox" id="check_all"/>
							</th>
							<th>单号</th>
							<th>仓库</th>
							<th>供应商</th>
						    <th>日期</th>
						    <th>商品编号</th>
						    <th>商品名</th>
						    <th>单位</th>
						    <th>类型</th>
						    <th>颜色</th>
						    <th>数量</th>
						    <th>单价</th>
							<th>应付</th>
							<th>实付</th>
							<th>欠款</th>
							<th>优惠金额</th>
							<th>备注</th>
							<th>经办人</th>
							<th>操作员</th>
							<th>操作</th>
						</tr>
					</thead>
					<tbody>
					
					</tbody>
				</table>
			</div>
		</div>
		<!-- 显示分页信息 -->
		<div class="row">
			<!--分页文字信息  -->
			<div class="col-md-6" id="page_info_area"></div>
			<!-- 分页条信息 -->
			<div class="col-md-6" id="page_nav_area">
				
			</div>
		</div>
		
	</div>
	<script type="text/javascript">
	
		var totalRecord,currentPage;
		//1、页面加载完成以后，直接去发送ajax请求,要到分页数据
		$(function(){
			//去首页
			to_page(1);
		});
		
		function to_page(pn){
			$.ajax({
				url:"${APP_PATH}/accountRecords/ars",
				data:"pn="+pn,
				type:"GET",
				success:function(result){
					
					//console.log(result);
					//1、解析并显示员工数据
					build_ars_table(result);
					//2、解析并显示分页信息
					build_page_info(result);
					//3、解析显示分页条数据
					build_page_nav(result);
				}
			});
		}
		
		function build_ars_table(result){
			//清空table表格
			$("#ars_table tbody").empty();
			var ars = result.extend.pageInfo.list;
			$.each(ars,function(index,item){
				var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
				var arIdTd = $("<td></td>").append(item.arId);
				var shNameTd = $("<td></td>").append(item.storeHouse.shName);
				var supNameTd = $("<td></td>").append(item.supplier.supName);
				var arDateTd = $("<td></td>").append(item.arDate);
				var goodsIdTd = $("<td></td>").append(item.goodsId);
				var goodsNameTd = $("<td></td>").append(item.goodsName);
				var goodsUnitTd = $("<td></td>").append(item.goodsUnit);
				var goodsTypeTd = $("<td></td>").append(item.goodsType);
				var goodsColorTd = $("<td></td>").append(item.goodsColor);
				var arAmountTd = $("<td></td>").append(item.arAmount);
				var arPriceTd = $("<td></td>").append(item.arPrice);
				var arPayableTd = $("<td></td>").append(item.arPayable);
				var arPaidTd = $("<td></td>").append(item.arPaid);
				var arArrearsTd = $("<td></td>").append(item.arArrears);
				var arDiscountTd = $("<td></td>").append(item.arDiscount);
				var arRemarkTd = $("<td></td>").append(item.arRemark);
				var arAttnTd = $("<td></td>").append(item.arAttn);
				var truenameTd = $("<td></td>").append(item.user.truename);
				var editBtn = $("<shiro:hasAnyRoles name="admin,manager"><button></button></shiro:hasAnyRoles>").addClass("btn btn-primary btn-sm edit_btn")
								.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
				//为编辑按钮添加一个自定义的属性，来表示当前员工id
				editBtn.attr("edit-id",item.arId);
				var delBtn =  $("<shiro:hasAnyRoles name="admin"><button></button></shiro:hasAnyRoles>").addClass("btn btn-danger btn-sm delete_btn")
								.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
				//为删除按钮添加一个自定义的属性来表示当前删除的员工id
				delBtn.attr("del-id",item.arId);
				var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);
				//var delBtn = 
				//append方法执行完成以后还是返回原来的元素
				$("<tr></tr>").append(checkBoxTd)
					.append(arIdTd)
					.append(shNameTd)
					.append(supNameTd)
					.append(arDateTd)
					.append(goodsIdTd)
					.append(goodsNameTd)
					.append(goodsUnitTd)
					.append(goodsTypeTd)
					.append(goodsColorTd)
					.append(arAmountTd)
					.append(arPriceTd)
					.append(arPayableTd)
					.append(arPaidTd)
					.append(arArrearsTd)
					.append(arDiscountTd)
					.append(arRemarkTd)
					.append(arAttnTd)
					.append(truenameTd)
					.append(btnTd)
					.appendTo("#ars_table tbody");
			});
		}
		//解析显示分页信息
		function build_page_info(result){
			$("#page_info_area").empty();
			$("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,总"+
					result.extend.pageInfo.pages+"页,总"+
					result.extend.pageInfo.total+"条记录");
			totalRecord = result.extend.pageInfo.total;
			currentPage = result.extend.pageInfo.pageNum;
		}
		//解析显示分页条，点击分页要能去下一页....
		function build_page_nav(result){
			//page_nav_area
			$("#page_nav_area").empty();
			var ul = $("<ul></ul>").addClass("pagination");
			
			//构建元素
			var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
			var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
			if(result.extend.pageInfo.hasPreviousPage == false){
				firstPageLi.addClass("disabled");
				prePageLi.addClass("disabled");
			}else{
				//为元素添加点击翻页的事件
				firstPageLi.click(function(){
					to_page(1);
				});
				prePageLi.click(function(){
					to_page(result.extend.pageInfo.pageNum -1);
				});
			}
			
			
			
			var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
			var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
			if(result.extend.pageInfo.hasNextPage == false){
				nextPageLi.addClass("disabled");
				lastPageLi.addClass("disabled");
			}else{
				nextPageLi.click(function(){
					to_page(result.extend.pageInfo.pageNum +1);
				});
				lastPageLi.click(function(){
					to_page(result.extend.pageInfo.pages);
				});
			}
			
			
			
			//添加首页和前一页 的提示
			ul.append(firstPageLi).append(prePageLi);
			//1,2，3遍历给ul中添加页码提示
			$.each(result.extend.pageInfo.navigatepageNums,function(index,item){
				
				var numLi = $("<li></li>").append($("<a></a>").append(item));
				if(result.extend.pageInfo.pageNum == item){
					numLi.addClass("active");
				}
				numLi.click(function(){
					to_page(item);
				});
				ul.append(numLi);
			});
			//添加下一页和末页 的提示
			ul.append(nextPageLi).append(lastPageLi);
			
			//把ul加入到nav
			var navEle = $("<nav></nav>").append(ul);
			navEle.appendTo("#page_nav_area");
		}
		
		//清空表单样式及内容
		function reset_form(ele){
			$(ele)[0].reset();
			//清空表单样式
			$(ele).find("*").removeClass("has-error has-success");
			$(ele).find(".help-block").text("");
		}
		
		//点击新增按钮弹出模态框。
		$("#accountRecords_add_modal_btn").click(function(){
			//清除表单数据（表单完整重置（表单的数据，表单的样式））
			reset_form("#accountRecordsAddModal form");
			//s$("")[0].reset();
			//发送ajax请求，查出部门信息，显示在下拉列表中
			getSups("#accountRecordsAddModal #select_supplier");
			
			getShs("#accountRecordsAddModal #select_storeHouse");
			
			getUsers("#accountRecordsAddModal #select_user");
			//弹出模态框
			$("#accountRecordsAddModal").modal({
				backdrop:"static"
			});
		});
		
		//查出所有的部门信息并显示在下拉列表中
		function getSups(ele){
			//清空之前下拉列表的值
			$(ele).empty();
			$.ajax({
				url:"${APP_PATH}/goods/suppliers",
				type:"GET",
				success:function(result){
					
					//显示部门信息在下拉列表中
					//$("#empAddModal select").append("id='building'")
					$.each(result.extend.suppliers,function(){
						var optionEle = $("<option></option>").append(this.supName).attr("value",this.supId);
						optionEle.appendTo(ele);
					});
				}
			});
			
		}
		function getShs(ele){
			//清空之前下拉列表的值
			$(ele).empty();
			$.ajax({
				url:"${APP_PATH}/goods/storeHouses",
				type:"GET",
				success:function(result){
					
					//显示部门信息在下拉列表中
					//$("#empAddModal select").append("")
					$.each(result.extend.storeHouses,function(){
						var optionEle = $("<option></option>").append(this.shName).attr("value",this.shId);
						optionEle.appendTo(ele);
					});
				}
			});
			
		}
		function getUsers(ele){
			//清空之前下拉列表的值
			$(ele).empty();
			$.ajax({
				url:"${APP_PATH}/user/users",
				type:"GET",
				success:function(result){
					
					//显示部门信息在下拉列表中
					//$("#empAddModal select").append("id='building'")
					$.each(result.extend.users,function(){
						var optionEle = $("<option></option>").append(this.truename).attr("value",this.id);
						optionEle.appendTo(ele);
					});
				}
			});
			
		}
		//校验表单数据
		function validate_add_form(){
			var arAmount = $("#arAmount_add_input").val();
			var regarAmount = /^[0-9]*$/;
			if(!regarAmount.test(arAmount)){
				//alert("用户名可以是2-5位中文或者6-16位英文和数字的组合");
				show_validate_msg("#arAmount_add_input", "error", "请输入数字");
				return false;
			}else{
				show_validate_msg("#arAmount_add_input", "success", "");
			};
			
		
			
			
			return true;
		}
		
		//显示校验结果的提示信息
		function show_validate_msg(ele,status,msg){
			//清除当前元素的校验状态
			$(ele).parent().removeClass("has-success has-error");
			$(ele).next("span").text("");
			if("success"==status){
				$(ele).parent().addClass("has-success");
				$(ele).next("span").text(msg);
			}else if("error" == status){
				$(ele).parent().addClass("has-error");
				$(ele).next("span").text(msg);
			}
		}
		
		//点击保存，保存员工。
		$("#accountRecords_save_btn").click(function(){
			//1、模态框中填写的表单数据提交给服务器进行保存
			//1、先对要提交给服务器的数据进行校验
			if(!validate_add_form()){
				return false;
			};
			
			//2、发送ajax请求保存员工
			$.ajax({
				url:"${APP_PATH}/accountRecords/insert",
				type:"POST",
				data:$("#accountRecordsAddModal form").serialize(),
				success:function(result){
					//alert(result.msg);
					if(result.code == 100){
						//员工保存成功；
						//1、关闭模态框
						$("#accountRecordsAddModal").modal('hide');
					
						var arId = result.extend.arId;
						alert("进货单号"+arId+"订单已添加成功");
						to_page(currentPage);
					}else{
						//显示失败信息
						//console.log(result);
						//有哪个字段的错误信息就显示哪个字段的；
						if(undefined != result.extend.errorFields.arAmount){
							//显示手机号的错误信息
							show_validate_msg("#arAmount_add_input", "error", result.extend.errorFields.arAmount);
						}
						
					}
				}
			});
		});
		
		//1、我们是按钮创建之前就绑定了click，所以绑定不上。
		//1）、可以在创建按钮的时候绑定。    2）、绑定点击.live()
		//jquery新版没有live，使用on进行替代
		$(document).on("click",".edit_btn",function(){
			//alert("edit");
			
			
			//1、查出部门信息，并显示部门列表
			getSups("#accountRecordsUpdateModal #select_supplier");
			
			getShs("#accountRecordsUpdateModal #select_storeHouse");
			
			getUsers("#accountRecordsUpdateModal #select_user");
			//2、查出员工信息，显示员工信息
			getAccountRecords($(this).attr("edit-id"));
			
			
			
			//3、把员工的id传递给模态框的更新按钮
			$("#accountRecords_update_btn").attr("edit-id",$(this).attr("edit-id"));
			$("#accountRecordsUpdateModal").modal({
				backdrop:"static"
			});
		});
		
		function getAccountRecords(id){
			$.ajax({
				url:"${APP_PATH}/accountRecords/select/"+id,
				type:"GET",
				success:function(result){
					//console.log(result);
					var accountRecordsData = result.extend.accountRecords;
					$("#arId_update_input").val(accountRecordsData.arId);
					$("#accountRecordsUpdateModal #select_storeHouse").val([accountRecordsData.shId]);
					$("#accountRecordsUpdateModal #select_supplier").val([accountRecordsData.supId]);
					$("#arDate_update_input").val(accountRecordsData.arDate);
					$("#goodsId_update_input").val(accountRecordsData.goodsId);
					$("#goodsName_update_input").val(accountRecordsData.goodsName);
					$("#goodsUnit_update_input").val(accountRecordsData.goodsUnit);
					$("#goodsType_update_input").val(accountRecordsData.goodsType);
					$("#goodsColor_update_input").val(accountRecordsData.goodsColor);
					$("#arAmount_update_input").val(accountRecordsData.arAmount);
					$("#arPrice_update_input").val(accountRecordsData.arPrice);
					$("#arPayable_update_input").val(accountRecordsData.arPayable);
					$("#arPaid_update_input").val(accountRecordsData.arPaid);
					$("#arArrears_update_input").val(accountRecordsData.arArrears);
					$("#arDiscount_update_input").val(accountRecordsData.arDiscount);
					$("#arRemark_update_input").val(accountRecordsData.arRemark);
					$("#arAttn_update_input").val(accountRecordsData.arAttn);
					$("#accountRecordsUpdateModal #select_user").val([accountRecordsData.arOperator]);
				}
			});
		}
		
		//点击更新，更新员工信息
		$("#accountRecords_update_btn").click(function(){
			
			//2、发送ajax请求保存更新的员工数据
			$.ajax({
				url:"${APP_PATH}/accountRecords/update/"+$(this).attr("edit-id"),
				type:"POST",
				data:$("#accountRecordsUpdateModal form").serialize(),
				success:function(result){
					//alert(result.msg);
					//1、关闭对话框
					$("#accountRecordsUpdateModal").modal("hide");
					//2、回到本页面
					to_page(currentPage);
				}
			});
		});
		
		//单个删除
		$(document).on("click",".delete_btn",function(){
			//1、弹出是否确认删除对话框
			var arId = $(this).attr("del-id");
			//alert($(this).parents("tr").find("td:eq(1)").text());
			if(confirm("确认删除【"+arId+"】吗？")){
				//确认，发送ajax请求删除即可
				$.ajax({
					url:"${APP_PATH}/accountRecords/delete/"+arId,
					type:"DELETE",
					success:function(result){
						alert(result.msg);
						//回到本页
						to_page(currentPage);
					}
				});
			}
		});
		
		//完成全选/全不选功能
		$("#check_all").click(function(){
			//attr获取checked是undefined;
			//我们这些dom原生的属性；attr获取自定义属性的值；
			//prop修改和读取dom原生属性的值
			$(".check_item").prop("checked",$(this).prop("checked"));
		});
		
		//check_item
		$(document).on("click",".check_item",function(){
			//判断当前选择中的元素是否5个
			var flag = $(".check_item:checked").length==$(".check_item").length;
			$("#check_all").prop("checked",flag);
		});
		
		//点击全部删除，就批量删除
		$("#accountRecords_delete_all_btn").click(function(){
			//
			var del_idstr = "";
			$.each($(".check_item:checked"),function(){
				//组装员工id字符串
				del_idstr += $(this).parents("tr").find("td:eq(1)").text()+"-";
			});
			//去除删除的id多余的-
			del_idstr = del_idstr.substring(0, del_idstr.length-1);
			if(confirm("确认删除【"+del_idstr+"】吗？")){
				//发送ajax请求删除
				$.ajax({
					url:"${APP_PATH}/accountRecords/delete/"+del_idstr,
					type:"DELETE",
					success:function(result){
						alert(result.msg);
						//回到当前页面
						to_page(currentPage);
					}
				});
			}
		});
	</script>
</body>
</html>