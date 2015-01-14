<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>深大图书馆</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="css/head.css" rel="stylesheet" type="text/css" media="screen" />
</head>
<body>
		<!-- start header -->
	<div id="header">
		<div id="logo">
			<h1>深大图书馆</h1>
		</div>
	</div>
	<!-- end header -->
	<div id="wrapper">
	<!-- start menu -->
	<div id="menu">
		<ul>
			<li class="current_page_item"><a href="main.jsp">检索</a></li>
			<li><a href="showMark.action">收藏</a></li>
			<li><a href="showBorrow.action?showType=false">用户</a></li>
			<s:if test="#session.user.uname!=null">
			<li><a href="logout.action">注销</a></li>
			</s:if>
			<s:else>
			<li><a href="login.jsp">登录</a></li>
			</s:else>
		</ul>
	</div>
	<!-- end menu -->
	</div>
</body>
</html>