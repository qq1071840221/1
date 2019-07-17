<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> 
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<FORM METHOD=POST ACTION="${users==null?'save':'update' }">
<input type="hidden" name="id" value="${users.id}">
uname	<INPUT TYPE="text" NAME="uname" value="${users.name }"><br>
<INPUT TYPE="submit" value="${users==null?'save':'update' }">
</FORM>
</body>
</html>

