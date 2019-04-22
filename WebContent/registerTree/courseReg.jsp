<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>课程注册页面</h1>
       <form id="courseReg" action="${pageContext.request.contextPath }/courseReg" method="post">
       	请输入课程号：<input type="text" id="id" name="id"><br>
       	请输入课程名：<input type="text" id="name" name="name"><br>
       	请输入任课教师：<input type="text" id="teacher" name="teacher"><br>
       	<input type="submit" value="提交"><br>
		<!-- jsp中的显示回显信息代码 -->
       <%= request.getAttribute("LoginInfo")==null?"":request.getAttribute("LoginInfo") %>
       </form>
</body>
</html>