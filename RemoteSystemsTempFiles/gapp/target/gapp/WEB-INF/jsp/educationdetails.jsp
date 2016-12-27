<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<title>Application Requirement</title>
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
		
	<div class="container-fluid">
		<div class="col-xs-5">
			<div class="form-group">
				<form method = "post" action="educationdetails.html" class="form-horizontal" role="form">
				<h1>Application Requirements</h1>
					<label for="exampleInputName2">GRE</label> 
					<input class="form-control" placeholder="GRE" name = "Gre"  />	
					<br/>
							
					<label for="exampleInputName2">GPA</label> 
					<input name = "Gpa" class="form-control" placeholder="GPA" >
					<br/>
					<label for="exampleInputName2">TOFEL</label> 
					<input name = "Tofel" type="text" class="form-control" placeholder="TOFEL"
					/>
					<label for="exampleInputName2">Transcript</label> 
					<a href="fileupload.html">Upload your Transcript Here</a>
					<br/>
					<input type="submit" value ="Save" class="btn btn-primary btn-sm">	
					<input type="submit" value="Next" class="btn btn-primary btn-sm"/>				
					</form>
			</div>	
		</div>

	</div>	
		

</body>
</html>