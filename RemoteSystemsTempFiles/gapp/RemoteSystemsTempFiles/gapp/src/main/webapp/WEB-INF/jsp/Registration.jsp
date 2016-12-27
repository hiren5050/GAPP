<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<link rel="stylesheet" type="text/css" href="/gapp/CSS/Login.css" />
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Registration</title>
</head>
<body>
	<div class="container">
		<div class="row centered-form">
			<div
				class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h3 class="panel-title">GAPP Registration</h3> 
						<a href="Login.html" class = "pull-right">Login From Here<span class="badge"></span></a><br>
					</div>
					<div class="panel-body">
						<form:form modelAttribute="user">
							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<label for="first_name">First Name</label>
										<form:input path="FirstName" class="form-control input-sm"
											placeholder="First Name" required="required" /><form:errors path = "FirstName"/>
											
									</div>
								</div>
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<label for="last_name">Last Name</label>
										<form:input path="LastName" class="form-control input-sm"
											placeholder="Last Name" required="required" />
											<form:errors path = "LastName"></form:errors>

									</div>
								</div>
							</div>

							<div class="form-group">
								<label for="last_name">Email</label>
								<form:input path="Email" class="form-control input-sm"
									placeholder="Email Address" id="login-Email" type="email" required="required" />
									
									<form:errors path = "Email"/>
							</div>

							<div class="row">
								<div class="col-xs-6 col-sm-6 col-md-6">
									<div class="form-group">
										<label for="last_name">Password</label>
										<form:input path="PassWord"  type = "password" class="form-control input-sm"
											placeholder="Password" required="required" />
											<form:errors path = "PassWord" class="form-control" id="inputError2"></form:errors>
									</div>
								</div>
							</div>

							<input type="submit" value="Register"
								class="btn btn-info btn-block" />
						</form:form>

					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>