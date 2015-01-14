<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>注册界面</title>
    <link href="css/login.css" rel="stylesheet" type="text/css" media="all" />
	<script src="js/jquery-1.11.0.min.js"></script>
	<script>
 	function myfocus(x){
 		x.value="";
 		$('.errMsg').fadeOut('slow', function(c){
	  		$('.errMsg').remove();
		});
	}  
</script>
</head>
<body>
<div class="message warning">
<div class="inset">
	<div class="login-head">
		<h1>注册</h1>
		 <div class="alert-close"> </div> 			
	</div>
		<form action="register" method="post" name="regForm">
			<li>
				<input type="text" class="text" name="user.Uname" value="Username" onfocus="myfocus(this)"><a href="#" class=" icon user"></a>
			</li>
				<div class="clear"> </div>
			<li>
				<input type="password" value="Password" name="user.Upass" onfocus="myfocus(this)"> <a href="#" class="icon lock"></a>
			</li>
			<div class="clear" style="height:15px">
			<s:if test="#request.regMsg!=''">
			<div class="errMsg" style="color:#f00"><s:property value="#request.regMsg"/></div>
			</s:if> 
			</div>
			<div class="submit">
				<input type="submit" value="注册" >
				<h4><a href="login.jsp">Login</a></h4>
						  <div class="clear"></div>	
			</div>
				
		</form>
		</div>					
	</div>
	</div>
	<div class="clear"> </div>
<!--- footer --->
<div class="footer">
	<p>Copyright &copy; 2014.</p>
</div>
</body>
</html>
