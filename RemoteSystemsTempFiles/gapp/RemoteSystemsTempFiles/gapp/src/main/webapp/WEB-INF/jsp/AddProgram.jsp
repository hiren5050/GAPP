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
<title>Add Program</title>
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

	<form class="form-horizontal" role="form" action="AddProgram.html"
		method="post">

		<div class="col-xs-5">
			<div class="form-group">
				<label for="ex3">Departments</label> <select class="form-control"
					id="ex3" name="department_id">

					<c:forEach items="${departments}" var="department">
						<option value="${department.d_id}">${department.name}</option>
					</c:forEach>
				</select>
			</div>


			<label for="ex3">Add Program</label> <input class="form-control"
				id="ex3" type="text" name="P_Name" placeholder="Add Program">
			<br /> <label for="ex3">Additional Requirement</label> <input
				class="form-control" id="ex3" type="text" name="Text"
				placeholder="Additional Field">
			<div class="form-group">
				<label for="sel1">Required?</label> <br />

				<div class="checkbox">
					<label><input type="checkbox" value="true" name="Required"></label>
				</div>


			</div>

			<input type="submit" value="admin" class="btn btn-info btn-block" />
		</div>
	</form>



</body>
</html>