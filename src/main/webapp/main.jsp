<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/bootstrap.css">
<script type="text/javascript" src="<%=path%>/js/jquery-1.4.2.js"></script>
  <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Document</title>
 
</head>
<framesrt>

<h1 style="text-align: center;">用户登陆</h1>
<hr style="border-color: black"/> 
<br/>
<br/>
<br/>
<br/>
<form action="<%=path%>/First.jsp" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">用户名：</label>
    <input type="text"  id="exampleInputEmail1">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">密&nbsp&nbsp&nbsp码：</label>
    <input type="password"  id="exampleInputPassword1" >
  </div>
  </div>
  <button type="submit" class="btn btn-default">登陆</button>
</form>
</framesrt>
</html>