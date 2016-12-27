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
<title>Edit Application</title>
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

<div class = "container" >
	<div class="container-fluid">
		<div class="col-xs-5">
			<div class="form-group">
				<form action = "EditApplication.html" method = "post" class="form-horizontal" role="form">
				
					<h1>Application Details </h1>
					<label for="ex3">Select Departments</label> <select
						class="form-control" id="ex3" name="department_id">
						
						<option>${applications.getPrograms().getDepartment().getName()}</option>
			
					</select>
					<br/>
					<lable for="ex3"><b>Select Program</b></lable>
					<select class="form-control" id="ddlprogram" name="program">
						<option >${applications.getPrograms().getP_Name()}</option>	
					</select>
					
					<label for="exampleInputName2">Term</label> 
					<select class = "form-control" id = "term" name = "term">
					<option value = "Fall 2016">Fall 2016</option>
					<option value = "Spring 2016">Spring 2016</option>
					</select>
					<br/>		
					<input type="submit" value="Save" class="btn btn-primary btn-sm"/>						
				</form>
			</div>
		</div>
	</div>
</div>

<div class = "container">
<div class="container-fluid">
		<div class="col-xs-5">
			<div class="form-group">
				<form:form modelAttribute="student"  action="studentEditApplication.html">
				<h1>Student Details</h1>
					<label for="exampleInputName2">First Name</label> 
					<form:input path = "FirstName"  class="form-control" placeholder="First Name" required = "required" />	
							
					<label for="exampleInputName2">Last Name</label> 
					<form:input path = "LastName" name = "LastName" class="form-control" placeholder="Last Name" required="required"/>
					
					<label for="exampleInputName2">Email Address</label> 
					<form:input path = "Email" name = "Email" type="email" class="form-control" placeholder="Email Address"
						required="required"/>
						 <label for="exampleInputName2">Gender</label>
						
						<form:select path = "Gender" name = "gender"  class = "form-control">
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
						<input type="submit" value="Save" class="btn btn-primary btn-sm"/>
					</form:form>
					
			</div>
		</div>
	</div>
	</div>
	<div class= "container">
	<div class="container-fluid">
		<div class="col-xs-5">
			<div class="form-group">
				<form  action="degreeEditApplication.html" method = "post" class="form-horizontal" role="form" enctype = "multipart/form-data">
				<h1>Education Background</h1>
					<label for="exampleInputName2">CollegeName</label>
					<input class="form-control" value="${applications.getStudent().getDegreetype().get(0).getName()}"   placeholder="College-Name" required = "required"  />	
					<br/>					
					<label for="exampleInputName2">Major</label> 
					<input name = "Major" value = "${applications.getStudent().getDegreetype().get(0).getMajor() }"  class="form-control" placeholder="Major" required="required">
					<br/>
					<label for="exampleInputName2">Start Date</label> 
					<input name = "StartDate" type="text" value="${applications.getStudent().getDegreetype().get(0).getStartDate() }"  class="form-control" placeholder="Start Date"/>
					<br/>
					<label for="exampleInputName2">End Date</label> 
					<input name = "EndDate" type="text" value = "${applications.getStudent().getDegreetype().get(0).getEndDate() }" class="form-control" placeholder="End Date" 
						/>
					<br/>
					<label for="exampleInputName2">Type</label> 
					<input name = "type" type="text" class="form-control" value="${application.getStudent().getDegreetype().get(0).getDegreeType()}" placeholder="Type of Degree" />	
					<br/>									
					<input type="submit" value="Save" class="btn btn-primary btn-sm"/>
				</form>

			</div>
		</div>
	</div>
	</div>	
	<div class = "container">
		<div class="container-fluid">
		<div class="col-xs-5">
			<div class="form-group">
				<form method = "post" value="rquirementEditApplication.html" class="form-horizontal" role="form" enctype = "multipart/form-data">
					
				<h1>Application Requirements</h1>
			
					<label for="exampleInputName2">GRE</label> 
					<input class="form-control" placeholder="GRE" required = "required" value ="${applications.getStudent().getEducationBackground().getGre() }" />	
					<br/>
							
					<label for="exampleInputName2">GPA</label> 
					<input name = "LastName" class="form-control" value = "${applications.getStudent().getEducationBackground().getGpa() }" placeholder="GPA" required="required">
					<br/>
					<label for="exampleInputName2">TOFEL</label> 
					<input name = "Email" type="text" class="form-control" placeholder="TOFEL" value = "${applications.getStudent().getEducationBackground().getToefl()}"
						/>
					<br/>
					
					</form>
					<form action="Fileupload.html" method = "post" enctype="multipart/form-data">
					 <label for="exampleInputName2">Transcript</label> 
					<input  type="file" name ="file" />
					<br/>
					
					<br/>	
					<br/>
					<input type="submit" value="Save" class="btn btn-primary btn-sm"/>
					
					</form>
					
														
	

			</div>
		</div>
	</div>
	</div>	
		
	
</body>
</html>