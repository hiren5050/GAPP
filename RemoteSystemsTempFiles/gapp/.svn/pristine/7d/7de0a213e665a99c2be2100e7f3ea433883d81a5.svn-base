<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<title>Student</title>
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
			<span class="navbar-brand">GAPP</span> <span class="navbar-brand">Student</span>			
			
		</div>
		<div id="navbarCollapse" class="collapse navbar-collapse">
			<a href="Login.html" class="nav pull-right"> <span
				class="glyphicon glyphicon-log-out"></span> Log out
			</a>
		</div>
		</nav>
	</div>



	<div class="container">
		<div class="row">
			<div class="col-md-12">

				<span class="pull-right"> <a href="CreateApplication.html"
					class="btn btn-lg btn-primary"> <span
						class="glyphicon glyphicon-plus"></span> Create new Application
				</a>
				</span>
				</h1>
			</div>
		</div>
		<table class="table">
			<thead class="thead-inverse">
				<tr>
					<th>No</th>
					<th>Department</th>
					<th>Program</th>
					<th>Term</th>
					<th>Status</th>
					<th>Operations</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${application}" var="app">
					<tr>
						<td>${app.getApplication().getA_id()}</td>
						<td>${app.getApplication().getPrograms().getDepartment().getName()}</td>
						<td>${app.getApplication().getPrograms().getP_Name()}</td>
						<td>${app.getApplication().getTerm()}</td>
						<td>${app.getStatus()}</td>
						<td><a href = "viewapplication.html?id=${app.getApplication().getA_id()}">Details</a></td>
						<td><a href = "EditApplication.html?id=${app.getApplication().getA_id()}">Edit</a>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>