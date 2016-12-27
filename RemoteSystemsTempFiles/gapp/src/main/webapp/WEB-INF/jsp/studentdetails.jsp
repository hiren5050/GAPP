<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<title>Student Details</title>
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
			<span class = "navbar-brand"><a href = "Student.html">Home</a></span>
		</div>
		<div id="navbarCollapse" class="collapse navbar-collapse">
			<a href="Login.html" class="nav pull-right"> <span
				class="glyphicon glyphicon-log-out"></span> Log out
			</a>
		</div>
		</nav>
	</div>
<div class="container-fluid">
		<div class="col-xs-5">
			<div class="form-group">
				<form:form modelAttribute="student" class="form-horizontal" role="form">
				<h1>Student Details</h1>
					<label for="exampleInputName2">First Name</label> 
					<form:input path = "FirstName" class="form-control" placeholder="First Name" required = "required" />	
							
					<label for="exampleInputName2">Last Name</label> 
					<form:input path = "LastName" name = "LastName" class="form-control" placeholder="Last Name" required="required"/>
					
					<label for="exampleInputName2">Email Address</label> 
					<form:input path = "Email" name = "Email" type="email" class="form-control" placeholder="Email Address"
						required="required"/>
						 <label for="exampleInputName2">Gender</label>
						
						<form:select path = "Gender" name = "gender"  class = "form-control">
							<option></option>
							<option value= "M">Male</option>
							<option value= "F">Female</option>
					</form:select>
					
					<br/>
					 <label for="exampleInputName2">Date of Birth</label> 
					<form:input  path = "Dateofbirth" type="date" class="form-control"
						placeholder="Date of birth" required="required"/>
					<label for="exampleInputName2">Phone No.</label> 
					<form:input path = "Phone" class="form-control" placeholder="Phone Number" required="required"/>
					
					<label for="exampleInputName2">Citizenship</label>
					 <form:input path= "citizenship" class="form-control" placeholder="Citizenship" required="required"/>
					<br/>
					<input type="hidden" name = "application_id" value = "${application.getA_id()}">									
					<input type="submit" value ="Save" class="btn btn-primary btn-sm">
					<input type="submit" value="Next" class="btn btn-primary btn-sm"/>					
				</form:form>

			</div>
		</div>

	</div>
</body>
</html>