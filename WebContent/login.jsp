<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录页面</title>
</head>
<body>
	
   <h1>登录界面：</h1>
	    
   <form class="login" method="post" action="${pageContext.request.contextPath }/login">
   		请输入用户名：<input type="text" id="username" name="name" ><br>
   		请输入密码：<input type="password" id="password" name="password">
   		<input type="submit" value="提交"><br>
   		<!-- jsp中的显示回显信息代码 -->
       <%= request.getAttribute("LoginInfo")==null?"":request.getAttribute("LoginInfo") %>  
   </form>
 
</body>
</html>