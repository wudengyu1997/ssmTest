<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
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
<frameset rows="25%,*" border="1px" >
<frame src="<%=path%>/top.jsp">
<frameset cols=20%,*">
<frame src="<%=path%>/menu.jsp">
<frame name="main" src="<%=path%>/right.jsp">
</frameset>
</frameset>
</html>