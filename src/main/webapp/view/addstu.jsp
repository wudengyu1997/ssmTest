<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'addview.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/bootstrap.css">
<script type="text/javascript" src="<%=path%>/js/jquery-1.4.2.js"></script>

<style type="text/css">
.commonbor {
	border-radius: 0px
}
</style>

</head>

<body>


	<div class="container">

		<br>
		<br>
		<div style="width: 400px; margin: 0px auto;">
			<form class="form-horizontal" action="<%=path %>/addstusub" method="post" enctype="multipart/form-data">
			<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">学号</label>
					<div class="col-sm-10">
						<input class="form-control commonbor" name="studentnum" placeholder="输入学号">
					</div>
					</div>
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">名字</label>
					<div class="col-sm-10">
						<input class="form-control commonbor" name="sname" placeholder="输入名字">
					</div>
				</div>
				
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">入学时间</label>
					<div class="col-sm-10">
						<input class="form-control commonbor" name="inschooltiem" placeholder="输入入学时间">
					</div>
				</div>
				
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">生日</label>
					<div class="col-sm-10">
						<<input type="date" value="" name="" placeholder="输入生日"/>
					</div>
				</div>

				<div class="form-group">
					<label for="inputPassword3" class="col-sm-2 control-label">性别</label>
					<div class="col-sm-10">
						<label><input type="radio" value="0" name="sex" checked="checked">男</label>
						 <input id="sexwm" type="radio" value="1" name="sex"><label for="sexwm">女</label>
					</div>
				</div>

				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">班级</label>
					<div class="col-sm-10">
						<input class="form-control commonbor" name="classid" placeholder="输入班级">
					</div>
				</div>


				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-primary commonbor">增&nbsp;&nbsp;&nbsp;&nbsp;加</button>
					</div>
				</div>
			</form>
		</div>


	</div>



</body>
</html>
