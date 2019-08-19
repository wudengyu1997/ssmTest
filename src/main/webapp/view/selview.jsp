<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<script type="text/javascript">
	var messagetitle = '${messagetitle}';
	if (messagetitle != "" && messagetitle != null) {
		alert(messagetitle);
	}
</script>

</head>

<body>


	<div class="container">

		<br> <br>

		<div class="table-responsive">

			<form class="form-horizontal">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">名字</label>
					<div class="col-sm-5">
						<input type="text" class="form-control" id="inputEmail3"
							placeholder="输入名字">
					</div>
					<div class="col-sm-5">
						<button type="submit" class="btn btn-default">搜索</button>
						<button type="button" class="btn btn-default"
							onclick="location.href='<%=path%>/addview'">增加</button>
					</div>
				</div>


			</form>

			<table
				class="table table-condensed table-hover table-bordered table-striped">

				<tr>
					<td>序号</td>
					<td>名字</td>
					<td>地址</td>
					<td>性别</td>
					<td>爱好</td>
					<td>图片</td>
					<td>操作</td>
				</tr>

				<c:forEach items="${peoplelist}" var="v" varStatus="vs">
					<tr>
						<td>${vs.count}</td>
						<td>${v.name }</td>
						<td>${v.addressObj.city}</td>
						<td>${v.sex }</td>
						<td>${v.hobby }</td>
						<td><img class="img-thumbnail" alt=""
							style="width: 100px;height: 100px"
							src="<%=path %>/upload/${v.imgpath }"></td>
						<td><button type="button" class="btn btn-info"
								onclick="location.href='<%=path%>/upview/${v.id}'">修改</button>
							<button type="button" class="btn btn-danger">删除</button></td>
					</tr>
				</c:forEach>
			</table>
		</div>

	</div>



</body>
</html>
