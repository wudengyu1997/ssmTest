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

<h3>学生管理</h3>
<hr />

	<div class="container">
		<br> <br>
		<div class="table-responsive">

			<form class="form-horizontal" action="<%=path%>/selallstu2/1">
				<div class="form-group">
					<label for="inputEmail3" class="col-sm-2 control-label">名字</label>
					<div class="col-sm-5">
						<input type="text" name="sname" class="form-control" id="inputEmail3"
							placeholder="输入名字">
					</div>
					<div class="col-sm-5">
						<button type="submit" class="btn btn-default">搜索</button>
						
					</div>
				</div>


			</form>

			<table 
				class="table table-condensed table-hover table-bordered table-striped">
		
				<tr>
					<td></td>
					<td>学号</td>
					<td>姓名</td>
					<td>入学时间</td>
					<td>出生年月</td>
					<td>性别</td>
					<td>班级</td>
					<td>操作</td>
				</tr>

				<c:forEach items="${s}" var="v" varStatus="vs">
					<tr>
						<td><input type="checkbox" ></td>
						<td>${v.studentnum}</td>
						<td>${v.sname }</td>
						<td>${v.inschooltiem}</td>
						<td>${v.birthday}</td>
						<td>${v.sex}</td>
						<td>${v.classid}</td>
						
						<td> <a type="button"  href="<%=path%>/deletebyid?id=${v.id}" class="btn btn-danger btn-sm">
                                <span class="" aria-hidden="true" ></span>
                                    删除</a>
									<button type="button" class="btn btn-info"
								onclick="location.href='<%=path%>/updatestu?id=${v.id }'">修改</button></td>
						
					</tr>
				</c:forEach>
	
			</table>
	<div style="text-align: center;">		
<nav >
  <ul class="pagination">
    <li>
      <a href="selallstu2/1" aria-label="Previous">
        <span aria-hidden="true">首页</span>
      </a>
      <a href="<%=path%>/selallstu2/${pageinfo.pageNum-1}" aria-label="Previous">
        <span aria-hidden="true">上一页</span>
      </a>

    </li>
    <c:forEach items="${pageinfo.getNavigatepageNums() }" var="page">
    
			<c:choose>
			<c:when test="${page==pageinfo.pageNum}">
			<li><a style="background-color: #00BFFF" href="selallstu2/${page }">${page}</a></li>
			</c:when>
			<c:otherwise>	
			 <li><a href="selallstu2/${page }">${page}</a></li>
			</c:otherwise>

			</c:choose>

    </c:forEach>
    <li>
    <a href="<%=path%>/selallstu2/${pageinfo.pageNum+1}" aria-label="Previous">
        <span aria-hidden="true">下一页</span>
      </a>
      <a href="selallstu2/${pageinfo.getPages() }" aria-label="Next">
        <span aria-hidden="true">尾页</span>
      </a>
     					 <td><button type="button" class="btn btn-info"
							onclick="location.href='<%=path%>/addstu'">增加</button>
							<button type="button" class="btn btn-info"
								onclick="location.href='<%=path%>/updatestu?id=${v.id }'">批量修改</button>
							<button type="button" class="btn btn-danger">批量删除</button></td>
							
    </li>
  </ul>
</nav>
		</div>	
		
		</div>
		
	</div>



</body>
</html>
