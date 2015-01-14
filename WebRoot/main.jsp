<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>深大图书馆</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="dwr/engine.js"></script>
<script type="text/javascript" src="dwr/util.js"></script>
<script type="text/javascript" src="dwr/interface/UserActionAjax.js"></script>
<link href="css/main.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
		var rows=$("table").find("tr");
		if(rows.length<2){$("table").hide();}
		$("tr:odd").css("background-color","#bbf");
		$("tr:even").css("background-color","#ffc");
});
    function show(boolean)
    {
     	 if(boolean)
     	 {
       	 alert("收藏成功！");
     	 }
     	 else{
     	 alert("该书已经在收藏夹中！")
     	 }
	}
    function mark(bookid){
      	UserActionAjax.mark(bookid,show);
    }
  </script>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<div id="main">
	<div id="find">
		<form action="find" method="post">
			<span class="find_input"><input type="text" class="input_text" name="bname"></span>
			<span class="find_btn"><input type="submit" class="input_btn" value="搜索"></span>
		</form>	
	</div>
	<div id="find_result">
		<table>
		<s:if test="#request.books[0]!=null">
			<tr>
			<th>书名</th><th>出版社</th><th>作者</th><th>馆藏</th><th>已借</th><th>位置</th><th></th>
			</tr>
		</s:if>
		<s:iterator value="#request.books" id="book">
		<tr>
		<td><s:property value="#book[1]"/></td>
		<td><s:property value="#book[2]"/></td>
		<td><s:property value="#book[3]"/></td>
		<td><s:property value="#book[4]"/></td>
		<td><s:property value="#book[5]"/></td>
		<td><s:property value="#book[6]"/></td>
		<s:if test="#session.user!=null">
			<td><input type="button" class="input_btn" value="收藏" onclick="mark(<s:property value="#book[0]"/>)"/></td>
		</s:if>
		</tr>
		</s:iterator>
		</table>
	</div>
</div>
</body>
</html>