<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<TABLE border="1" width="100%">
<TR>
	<TD>id</TD>
	<TD>name</TD>
	<TD>operate</TD>
</TR>
<c:forEach var="users" items="${list}">
<TR>
	<TD>${info.id }</TD>
	<TD>${info.name }</TD>
	<TD>
	<a href="delete?id=${users.id}">Delete</a> 
	<a href="findById?id=${users.id}">Update</a>
</TR>
</c:forEach>
</TABLE>
</body>
</html>

<a href="goInput">save</a>