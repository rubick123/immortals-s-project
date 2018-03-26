<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
<form action="FormRequerstServlet" method = "POST">
<p>用户名：<input name="username" type = "text"></p>
<p>密码：<input name = "password" type = "password"></p>
<p>信息来源：<input name = "channer" type = "checkbox" value = "Web">网络
<input name = "channel" type = "checkbox" value = "Newspaper">报纸
<input name = "channel" type = "checkbox" value = "Friend">亲友</p>
<p><input type = "reset" value = "提交"/><input type = "reset" calue = "重置"/></p>
<form>
</body>
</html>