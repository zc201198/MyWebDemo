<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js" type="text/javascript"></script>
<!-- 表单校验插件 -->
<script src="${pageContext.request.contextPath}/js/jquery.validate.min.js" type="text/javascript"></script>
<script type="text/javascript">
$.validator.addMethod(
		//规则的名称
		"checkUsername",
		//校验的函数
		function(value,element,params){
			
			//定义一个标志
			var flag = false;
			
			//value:输入的内容
			//element:被校验的元素对象
			//params：规则对应的参数值
			//目的：对输入的name进行ajax校验
			$.ajax({
				"async":false,
				"url":"${pageContext.request.contextPath}/checkUsername",
				"data":{"name":value},
				"type":"POST",
				"dataType":"json",
				"success":function(data){
					flag = data.isExist;
				}
			});
			
			
			//返回false代表该校验器不通过
			return !flag;
		}
		
	);
	$(function(){
		$("#userResg").validate({
			rules:{
				"name":{
					"required":true,
					"checkUsername":true
				},
				"password":{
					"required":true,
					"rangelength":[6,12]
				},
				"repassword":{
					"required":true,
					"rangelength":[6,12],
					"equalTo":"#password"
				},
				"email":{
					"required":true,
					"email":true
				},
				"sex":{
					"required":true,
				},
			},
			messages:{
				"name":{
					"required":"用户名不能为空",
					"checkUsername":"用户名已存在"
				},
				"password":{
					"required":"密码不能为空",
					"rangelength":"密码介于6-12之间"
				},
				"repassword":{
					"required":"密码不能为空",
					"rangelength":"密码介于6-12之间",
					"equalTo":"两次密码不一致，请重新输入！"
				},
				"email":{
					"required":"邮箱不能为空",
					"email":"邮箱格式不正确"
				}
			}
		});
	});
</script>

<body>
<h1>用户注册页面</h1>
       <form id="userResg" action="${pageContext.request.contextPath }/userRes" method="post">
       		请输入用户名:<input type="text" id="username" name="name"><br>
       		请输入密码:<input type="password" id="password" name="password"><br>
       		请再输入密码：<input type="password" id="confirmpwd" name="repassword"><br>
       		请输入性别:<input type="radio"name="sex" id="sex1" value="male"> 男
					<input type="radio" name="sex" id="sex2" value="female"> 女<br>
       		请输入年龄:<input type="text" id="age" name="age"><br>
       		请输入学历:<input type="text" id="record" name="record"><br>
       		请输入电话:<input type="text" id="telephone" name="telephone"><br>
       		请输入E-mail:<input type="text" id="email" name="email"><br>
       		<input type="submit" value="提交"><br>
       		<!-- jsp中的显示回显信息代码 -->
       <%= request.getAttribute("LoginInfo")==null?"":request.getAttribute("LoginInfo") %>
       </form>
       
</body>
</html>