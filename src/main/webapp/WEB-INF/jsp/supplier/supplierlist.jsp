<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%> 
<%@ page import="java.text.*"%> 
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>供应商列表</title>
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

<!-- 供应商修改的模态框 -->
<div class="modal fade" id="supplierUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">供应商修改</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">供应商名称</label>
		    <div class="col-sm-10">
		    <input type="text" name="supName" class="form-control" id="supName_update_input" value="readonly" readonly>
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">负责人</label>
		    <div class="col-sm-10">
		      <input type="text" name="supLinkman" class="form-control" id="supLinkman_update_input">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">手机号</label>
		    <div class="col-sm-10">
		      <input type="text" name="supPhone" class="form-control" id="supPhone_update_input" >
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">地址</label>
		    <div class="col-sm-10">
		      <input type="text" name="supAddress" class="form-control" id="supAddress_update_input" >
		      <span class="help-block"></span>
		    </div>
		  </div>
		  
		   <div class="form-group">
		    <label class="col-sm-2 control-label">备注</label>
		    <div class="col-sm-10">
		      <input type="text" name="supRemark" class="form-control" id="supRemark_update_input" >
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">期初应付</label>
		    <div class="col-sm-10">
		      <input type="text" name="supPay" class="form-control" id="supPay_update_input" >
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">类型</label>
		    <div class="col-sm-4">
		    	<!-- 部门提交部门id即可 -->
		      <select class="form-control" name="supType">
		      </select>
		    </div>
		  </div>
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="supplier_update_btn">更新</button>
      </div>
    </div>
  </div>
</div>

<!-- 供应商添加的模态框 -->
<div class="modal fade" id="supplierAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">供货商添加</h4>
      </div>
      <div class="modal-body">
        <form class="form-horizontal">
		  <div class="form-group">
		    <label class="col-sm-2 control-label">供应商名称</label>
		    <div class="col-sm-10">
		      <input type="text" name="supName" class="form-control" id="supName_add_input" placeholder="请输入供应商名称">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">负责人</label>
		    <div class="col-sm-10">
		      <input type="text" name="supLinkman" class="form-control" id="supLinkman_add_input" placeholder="请输入负责人姓名">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">手机号</label>
		    <div class="col-sm-10">
		      <input type="text" name="supPhone" class="form-control" id="supPhone_add_input" placeholder="请输入手机号">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">地址</label>
		    <div class="col-sm-10">
		      <input type="text" name="supAddress" class="form-control" id="supAddress_add_input"  placeholder="请输入地址">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">评价</label>
		    <div class="col-sm-10">
		      <input type="text" name="supRemark" class="form-control" id="supRemark_add_input" placeholder="请输入评价（不可大于100）">
		      <span class="help-block"></span>
		    </div>
		  </div>
		   <div class="form-group">
		    <label class="col-sm-2 control-label">期初应付</label>
		    <div class="col-sm-10">
		      <input type="text" name="supPay" class="form-control" id="supPay_add_input" placeholder="请输入期初应付">
		      <span class="help-block"></span>
		    </div>
		  </div>
		  <div class="form-group">
		    <label class="col-sm-2 control-label">类型</label>
		    <div class="col-sm-4">
		    	<!-- 部门提交部门id即可 -->
		      <select class="form-control" name="supType">
		      </select>
		    </div>
		  </div>
		  
		</form>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
        <button type="button" class="btn btn-primary" id="supplier_save_btn">保存</button>
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
				<button class="btn btn-primary" id="supplier_add_modal_btn">新增</button>
			</shiro:hasAnyRoles>	
			<shiro:hasAnyRoles name="admin">
				<button class="btn btn-danger" id="supplier_delete_all_btn">删除</button>
			</shiro:hasAnyRoles>
			</div>
		</div>
		
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="suppliers_table">
					<thead>
						<tr>
							<th>
								<input type="checkbox" id="check_all"/>
							</th>
							<th>#</th>
							<th>供应商名称</th>
							<th>负责人</th>
							<th>手机号</th>
							<th>地址</th>
							<th>备注</th>
							<th>期初应付</th>
							<th>类型</th>
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
				url:"${APP_PATH}/supplier/sups",
				data:"pn="+pn,
				type:"GET",
				success:function(result){
					
					//console.log(result);
					//1、解析并显示员工数据
					build_suppliers_table(result);
					//2、解析并显示分页信息
					build_page_info(result);
					//3、解析显示分页条数据
					build_page_nav(result);
				}
			});
		}
		
		function build_suppliers_table(result){
			//清空table表格
			$("#suppliers_table tbody").empty();
			var suppliers = result.extend.pageInfo.list;
			$.each(suppliers,function(index,item){
				var checkBoxTd = $("<td><input type='checkbox' class='check_item'/></td>");
				var supIdTd = $("<td></td>").append(item.supId);
				var supNameTd = $("<td></td>").append(item.supName);
				var supLinkmanTd = $("<td></td>").append(item.supLinkman);
				var supPhoneTd = $("<td></td>").append(item.supPhone);
				var supAddressTd = $("<td></td>").append(item.supAddress);
				var supRemarkTd = $("<td></td>").append(item.supRemark);
				var supPayTd = $("<td></td>").append(item.supPay);
				var supplierTypenameTd = $("<td></td>").append(item.supplierType.supplierTypename);

				var editBtn = $("<shiro:hasAnyRoles name="admin,manager"><button></button></shiro:hasAnyRoles>").addClass("btn btn-primary btn-sm edit_btn")
								.append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
				//为编辑按钮添加一个自定义的属性，来表示当前员工id
				editBtn.attr("edit-id",item.supId);
				var delBtn =  $("<shiro:hasAnyRoles name="admin"><button></button></shiro:hasAnyRoles>").addClass("btn btn-danger btn-sm delete_btn")
								.append($("<span></span>").addClass("glyphicon glyphicon-trash")).append("删除");
				//为删除按钮添加一个自定义的属性来表示当前删除的员工id
				delBtn.attr("del-id",item.supId);
				var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);
				//var delBtn = 
				//append方法执行完成以后还是返回原来的元素
				$("<tr></tr>").append(checkBoxTd)
					.append(supIdTd)
					.append(supNameTd)
					.append(supLinkmanTd)
					.append(supPhoneTd)
					.append(supAddressTd)
					.append(supRemarkTd)
					.append(supPayTd)
					.append(supplierTypenameTd)
					.append(btnTd)
					.appendTo("#suppliers_table tbody");
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
		$("#supplier_add_modal_btn").click(function(){
			//清除表单数据（表单完整重置（表单的数据，表单的样式））
			reset_form("#supplierAddModal form");
			//s$("")[0].reset();
			//发送ajax请求，查出部门信息，显示在下拉列表中
			getTypes("#supplierAddModal select");
			
			//弹出模态框
			$("#supplierAddModal").modal({
				backdrop:"static"
			});
		});
		
		//查出所有的部门信息并显示在下拉列表中
		function getTypes(ele){
			//清空之前下拉列表的值
			$(ele).empty();
			$.ajax({
				url:"${APP_PATH}/supplierType/types",
				type:"GET",
				success:function(result){
					$.each(result.extend.types,function(){
						var optionEle = $("<option></option>").append(this.supplierTypename).attr("value",this.id);
						optionEle.appendTo(ele);
					});
				}
			});
			
		}
		
		
		//校验表单数据
		function validate_add_form(){
			//1、拿到要校验的数据，使用正则表达式
			var supPhone = $("#supPhone_add_input").val();
			var regphone = /^1[3|4|5|8][0-9]\d{4,8}$/;
			if(!regphone.test(supPhone)){
				//alert("用户名可以是2-5位中文或者6-16位英文和数字的组合");
				show_validate_msg("#supPhone_add_input", "error", "请输入正确的手机号");
				return false;
			}else{
				show_validate_msg("#supPhone_add_input", "success", "");
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
		$("#supplier_save_btn").click(function(){
			//1、模态框中填写的表单数据提交给服务器进行保存
			//1、先对要提交给服务器的数据进行校验
			if(!validate_add_form()){
				return false;
			};
			//1、判断之前的ajax用户名校验是否成功。如果成功。
			if($(this).attr("ajax-va")=="error"){
				return false;
			}
			
			//2、发送ajax请求保存员工
			$.ajax({
				url:"${APP_PATH}/supplier/insert",
				type:"POST",
				data:$("#supplierAddModal form").serialize(),
				success:function(result){
					//alert(result.msg);
					if(result.code == 100){
						//员工保存成功；
						//1、关闭模态框
						$("#supplierAddModal").modal('hide');
						
						//2、因为是根据供应商类型排序，回第一页，显示刚才保存的数据
						//发送ajax请求显示最后一页数据即可
						to_page(1);
						
					}else{
						//显示失败信息
						//console.log(result);
						//有哪个字段的错误信息就显示哪个字段的；
						
						if(undefined != result.extend.errorFields.supPhone){
							//显示手机号的错误信息
							show_validate_msg("#supPhone_add_input", "error", result.extend.errorFields.supPhone);
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
			getTypes("#supplierUpdateModal select");
			
			//2、查出员工信息，显示员工信息
			getSupplier($(this).attr("edit-id"));
			
			
			
			//3、把员工的id传递给模态框的更新按钮
			$("#supplier_update_btn").attr("edit-id",$(this).attr("edit-id"));
			$("#supplierUpdateModal").modal({
				backdrop:"static"
			});
		});
		
		function getSupplier(id){
			$.ajax({
				url:"${APP_PATH}/supplier/select/"+id,
				type:"GET",
				success:function(result){
					//console.log(result);
					var supplierData = result.extend.supplier;
					$("#supName_update_input").val(supplierData.supName);
					$("#supLinkman_update_input").val(supplierData.supLinkman);
					$("#supPhone_update_input").val(supplierData.supPhone);
					$("#supAddress_update_input").val(supplierData.supAddress);
					$("#supRemark_update_input").val(supplierData.supRemark);
					$("#supPay_update_input").val(supplierData.supPay);
					$("#supplierUpdateModal select").val([supplierData.supType]);
					
				}
			});
		}
		
		//点击更新，更新员工信息
		$("#supplier_update_btn").click(function(){
			//2、发送ajax请求保存更新的员工数据
			$.ajax({
				url:"${APP_PATH}/supplier/update/"+$(this).attr("edit-id"),
				type:"POST",
				data:$("#supplierUpdateModal form").serialize(),
				success:function(result){
					
					//alert(result.msg);
					//1、关闭对话框
					$("#supplierUpdateModal").modal("hide");
					//2、回到本页面
					to_page(currentPage);
				}
			});
		});
		
		//单个删除
		$(document).on("click",".delete_btn",function(){
			//1、弹出是否确认删除对话框
			var supName = $(this).parents("tr").find("td:eq(2)").text();
			var supId = $(this).attr("del-id");
			//alert($(this).parents("tr").find("td:eq(1)").text());
			if(confirm("确认删除【"+supName+"】吗？")){
				//确认，发送ajax请求删除即可
				$.ajax({
					url:"${APP_PATH}/supplier/delete/"+supId,
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
		$("#supplier_delete_all_btn").click(function(){
			//
			var supNames = "";
			var del_idstr = "";
			$.each($(".check_item:checked"),function(){
				//this
				supNames += $(this).parents("tr").find("td:eq(2)").text()+",";
				//组装员工id字符串
				del_idstr += $(this).parents("tr").find("td:eq(1)").text()+"-";
			});
			//去除supNames多余的,
			supNames = supNames.substring(0, supNames.length-1);
			//去除删除的id多余的-
			del_idstr = del_idstr.substring(0, del_idstr.length-1);
			if(confirm("确认删除【"+supNames+"】吗？")){
				//发送ajax请求删除
				$.ajax({
					url:"${APP_PATH}/supplier/delete/"+del_idstr,
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