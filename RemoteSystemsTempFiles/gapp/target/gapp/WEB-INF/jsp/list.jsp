<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>User List</title>
</head>
<body>
<table border = "1">
	
	<tr><th>Id</th><th>Email</th><th>FirtName </th><th>LastName</th><th>Password</th></tr>

<c:forEach items ="${users}" var = "users">
	<tr>
		<td>${users.id}</td>
		<td>${users.email}</td>
		<td>${users.firstName}</td>
		<td>${users.lastName}</td>
		<td>${users.passWord}</td>
		<td>${users.user_type} </td>
		
	</tr>
	
</c:forEach>

</table>

</body>
</html>