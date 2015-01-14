<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>收藏夹</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="css/main.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
		var rows=$("table").find("tr");
		if(rows.length<2){$("table").hide();}
		$("tr:odd").css("background-color","#bbf");
		$("tr:even").css("background-color","#ffc");
});
</script>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div id="main">
	<div id="showMarks">
		<table id="markTable" class="table">
			<tr>
			<th>书名</th><th>出版社</th><th>作者</th><th>馆藏</th><th>已借</th><th>位置</th><th></th>
			</tr>
		<s:iterator value="#request.marks" id="mark">
		<tr>
		<td><s:property value="#mark.bname"/></td>
		<td><s:property value="#mark.publisher"/></td>
		<td><s:property value="#mark.author"/></td>
		<td><s:property value="#mark.totalNum"/></td>
		<td><s:property value="#mark.borrowNum"/></td>
		<td><s:property value="#mark.addr"/></td>
		<td><a href="delmark.action?book.bid=<s:property value="#mark.bid"/>">取消收藏</a></td>
		</tr>
		</s:iterator>
		</table>
	</div>
</div>
</body>
</html>