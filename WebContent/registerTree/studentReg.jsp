<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>学生注册页面</h1>
	<form id="studentReg" action="${pageContext.request.contextPath }/studentReg" method="post">
		请输入学生学号：<input type="text" id="studentid" name="studentid"><br>
		请输入学生姓名：<input type="text" id="name" name="name"><br>
		请输入学生班级：<input type="text" id="banji" name="banji"><br>
		请输入性别:<input type="radio"name="sex" id="sex1" value="male"> 男
				<input type="radio" name="sex" id="sex2" value="female"> 女<br>
		请输入专业：<input type="text" id="professional" name="professional"><br>	
		请输入院系：<input type="text" id="dept" name="dept"><br>	
		请输入年龄：<input type="text" id="age" name="age"><br>	
		请输入手机号：<input type="text" id="telephone" name="telephone"><br>
		<input type="submit" value="提交">
		<!-- jsp中的显示回显信息代码 -->
       <%= request.getAttribute("LoginInfo")==null?"":request.getAttribute("LoginInfo") %>	
	</form>
</body>
</html>