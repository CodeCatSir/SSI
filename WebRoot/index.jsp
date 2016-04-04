<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>登录</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  </head>
  
  <body>
  	<form action="${pageContext.request.contextPath}/zy/login.action" method="post">
  		<div>
  			<label>用户名：</label>
  			<input type="text" name="${name}">
  		</div>
  		<div>
  			<input type="submit" value="登录">
  		</div>
  		
  	</form>
  </body>
</html>
