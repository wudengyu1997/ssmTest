<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/bootstrap.css">
<script type="text/javascript" src="<%=path%>/js/jquery-1.4.2.js"></script>
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Document</title>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>


</head>
<body>
<div style="font-size: 25px;text-align: center;margin-top: 25%;" ><a class="a1">用户管理</a><br/><div>
<div ><a target="main" href="http://127.0.0.1:8080/ssm_2019_8_5/selclassAll">班级管理</a><br/><div>
<div><a target="main" href="http://127.0.0.1:8080/ssm_2019_8_5/selectSyllabus2">课程管理</a><br/><div>
<div><a target="main" href="http://127.0.0.1:8080/ssm_2019_8_5/selectTeacherAll">教师管理</a><br/><div>
<div><a target="main" href=http://127.0.0.1:8080/ssm_2019_8_5/selallstu2/1>学生管理</a><br/><div>
<div><a target="main" href="http://127.0.0.1:8080/ssm_2019_8_5/login.jsp">登陆/退出系统</a><br/><div>
</body>
</html>