<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<div class="zc1" align="center" style="padding-top:20px">
 		<c:if test="${empty user}">
				<span><a href="login.jsp">登录</a></span>
				<span><a href="register.jsp">注册</a></span>
 		</c:if>
 		<c:if test="${!empty user}">
 			<span style="color:red">欢迎您，${user.name }</span>
 			<span><a href="${pageContext.request.contextPath }/loginOut">退出</a></span>
 		</c:if>
	</div>
 
</body>
</html>