<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>借书记录</title>
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
<jsp:include page="userMenu.jsp"></jsp:include>
<div id="userMain">
	<div id="showMarks">
		<table id="markTable" class="table">
			<tr>
			<th>书名</th><th>借书日期</th>
			<s:if test="#request.type">
			<th>还书日期</th>
			</s:if>
			<s:else>
			<th>应还日期</th>
			</s:else>
			</tr>
		<s:iterator value="#request.list" id="list">
		<tr>
		<td><s:property value="#list.book.bname"/></td>
		<td><s:property value="#list.brwDate"/></td>
		<s:if test="#request.type">
		<td><s:property value="#list.rtnDate"/></td>
		</s:if>
		<s:else>
		<td><s:property value="#list.needDate"/></td>
		</s:else>
		</tr>
		</s:iterator>
		</table>
	</div>
</div>
</body>
</html>