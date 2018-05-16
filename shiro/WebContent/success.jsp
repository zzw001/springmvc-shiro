<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
welcome <shiro:principal></shiro:principal>
<a href="index/logout">logout</a><br>
<shiro:hasRole name="admin">
<a href="admin.jsp">admin page</a><br>
</shiro:hasRole>
<shiro:hasRole name="user">
<a href="user.jsp">user page</a><br>
</shiro:hasRole>

</body>
</html>