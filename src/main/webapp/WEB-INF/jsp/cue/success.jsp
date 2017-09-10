<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("APP_PATH", request.getContextPath());
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript"
	src="${APP_PATH }/js/jquery-1.12.4.min.js"></script>
<link
	href="${APP_PATH }/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${APP_PATH }/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<style> 
body{text-align:center} 
.divcss5{margin:0 auto;} 
</style>
<style type="text/css">
body {
	font-family: 'Courgette', cursive;
}

body {
	background: #f3f3e1;
}

.wrap {
	margin: 0 auto;
	width: 1000px;
}

.logo {
	margin-top: 50px;
}

.logo h1 {
	font-size: 100px;
	color: #8F8E8C;
	text-align: center;
	margin-bottom: 1px;
	text-shadow: 1px 1px 6px #fff;
}

.logo p {
	color: rgb(228, 146, 162);
	font-size: 20px;
	margin-top: 1px;
	text-align: center;
}

.logo p span {
	color: lightgreen;
}

.sub a {
	color: white;
	background: #8F8E8C;
	text-decoration: none;
	padding: 7px 120px;
	font-size: 13px;
	font-family: arial, serif;
	font-weight: bold;
	-webkit-border-radius: 3em;
	-moz-border-radius: .1em;
	-border-radius: .1em;
}

.footer {
	color: #8F8E8C;
	position: absolute;
	right: 10px;
	bottom: 10px;
}

.footer a {
	color: rgb(228, 146, 162);
}
</style>
<title>成功</title>
</head>
<body>
	<div class="wrap">
		<div class="logo">
			<h1>恭喜您，已完成填写</h1>
			<p>您的进货单，明细单号为${arId}已完成填写</p>
			<p>您可以点击一下按钮选择返回查看</p>
			<form class="navbar-form navbar-center" role="search"
				action="${APP_PATH}/subscriber/OneDetaillist" method="post">
				<div class="form-group">
					<input type="text" name="search" value="${arId}" class="form-control" readonly="readonly">
				</div>
				<button type="submit" class="btn btn-default">查询</button>
			</form>
		</div>
	</div>


</body>
</html>