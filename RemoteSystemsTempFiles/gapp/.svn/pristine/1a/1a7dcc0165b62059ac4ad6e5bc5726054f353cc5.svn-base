<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
<style type="text/css">
.bs-example {
	margin: 20px;
}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View department</title>
</head>
<body>
<div class="bs-example">
		<nav role="navigation" class="navbar navbar-default">
		<div class="navbar-header">
			<button type="button" data-target="#navbarCollapse"
				data-toggle="collapse" class="navbar-toggle">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<span class="navbar-brand">GAPP</span>

		</div>
		<div id="navbarCollapse" class="collapse navbar-collapse">
			<a href="Login.html" class="nav pull-right"> <span
				class="glyphicon glyphicon-log-out"></span> Log out
			</a>
		</div>
		</nav>
	</div>
	<div class="container">
	<h3 class="sub-header">Department Details</h3>
		<table class="table table-bordered" >
			<thead>
				<tr>
					<th>Department</th>
					<th>Program</th>
					
				</tr>
			</thead>
			<tbody>
				<tr class="info">
					<td class="field-label col-xs-3 active">${department.name}</td>
					<c:forEach items = "${programs}" var="pro">
					<td class="field-label col-xs-3 active">${pro.getP_Name()}</td>
					</c:forEach>				
				</tr>
			</tbody>
		</table>
	</div>

<div class="container">
	<h3 class="sub-header">Additional Requirement</h3>
		<table class="table table-bordered">
			<thead>
				<tr>   
					<th>Name</th>
 				   	<th>Required or not </th>
 				</tr>
			</thead>
			<tbody>				 
    						
 				<c:forEach items = "${additionals}" var="add">					 
 				<tr>
 					<td>${add.getText()}</td>
 	 				<td>${add.isRequired()}</td>
 				</tr>
 				</c:forEach>
				
			</tbody>
		</table>
	</div>
</body>
</html>