<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%> 
<%@ page import="java.text.*"%> 
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

	<!-- 搭建显示页面 -->
	<div class="container">
	<!-- 按钮 -->
		<div class="row">
			<div class="col-md-4 col-md-offset-8">
			</div>
		</div>
		<!-- 显示表格数据 -->
		<div class="row">
			<div class="col-md-12">
				<table class="table table-hover" id="ars_table">
					<thead>
						<tr>
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
				url:"${APP_PATH}/accountRecords/ar/${arId}",
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
				
				//var delBtn = 
				//append方法执行完成以后还是返回原来的元素
				$("<tr></tr>")
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
		
		
		
	</script>
</body>
</html>