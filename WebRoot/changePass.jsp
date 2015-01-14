<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改密码</title>
<link href="css/main.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
function checkPass()
{
	if ($("#pass0").val()==""||$("#pass1").val()=="")
	{
		alert("密码不能为空！");
	}
	else if ($("#pass1").val()!=$("#pass2").val())
	{
		alert("两次输入的密码不一样！");
		$("#pass0").val("");
		$("#pass1").val("");
		$("#pass2").val("");
	}
	else{
		$("form:first").submit();
	}
}
</script>
</head>
<body>
<jsp:include page="head.jsp"></jsp:include>
<jsp:include page="userMenu.jsp"></jsp:include>
<div id="userMain">
<form action="changePass" method="post">
<table id="changePassTable">
<tr><td>原始密码：</td><td><input type="password" id="pass0" class="input_text" name="pass0"/></tr>
<tr><td>修改后密码：</td><td><input type="password" id="pass1" class="input_text" name="pass1"/></tr>
<tr><td>确认密码：</td><td><input type="password" class="input_text"  id="pass2"/></tr>
<tr><td><input type="button" class="input_btn" value="提交" onclick="checkPass()"/></td><td><input type="button" class="input_btn" value="返回"></td>
</table>
</form>
</div>
</body>
</html>