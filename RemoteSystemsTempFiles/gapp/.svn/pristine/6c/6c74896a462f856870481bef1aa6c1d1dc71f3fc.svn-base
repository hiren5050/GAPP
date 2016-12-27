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
<title>View Application</title>
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



	<div class="container">
		<div class="row">
			<div class="col-md-12"></div>
			<div class="col-sm-5">
				<div class="panel panel-default">
					<div class="panel-heading">
						Application Information
					</div>
					<div class="panel-body ">

						<table
							class="table table-condensed table-summary table-borderless ">
							<tbody>
						<%-- <c:forEach items = "${application}" var = "app">--%>	
								<tr>
									<td class="summary-heading"><b>Department</b></td>
									<td class="summary-content">${applications.getPrograms().getDepartment().getName() }</td>
								</tr>
								<tr>
									<td class="summary-heading"><b>Program</b></td>
									<td>${applications.getPrograms().getP_Name()}</td>
								</tr>
								<tr>
									<td class="summary-heading"><b>Term</b></td>
									<td>${applications.getTerm()}</td>
								</tr>
								
								
							</tbody>
						</table>

					</div>
				</div>
			</div>
			<div class="col-sm-5">
				<div class="panel panel-default">
					<div class="panel-heading">Education Background</div>
					<div class="panel-body ">
										<table
							class="table table-condensed table-summary table-borderless ">
							<tbody>
							
								<tr>
									<td class="summary-heading"><b>College Name</b></td>
									<td class="summary-content">${applications.getStudent().getDegreetype().get(0).getName()}</td>
								</tr>


								<tr>
									<td class="summary-heading"><b>Degree Name</b></td>
									<td class="summary-content">${applications. getStudent().getDegreetype().get(0).getDegreeType()}</td>
								</tr>
								<tr>
									<td><b>Major</b></td>
									<td>${applications.getStudent().getDegreetype().get(0).getMajor()}</td>
								</tr>
								<tr>
									<td><b>Start Date</b></td>
									<td>${applications.getStudent().getDegreetype().get(0).getStartDate()}</td>
								</tr>
								<tr>
									<td><b>End Date</b></td>
									<td>${applications.getStudent().getDegreetype().get(0).getEndDate()}</td>
								</tr>
								
							</tbody>
						</table>

	
					</div>
				</div>

			</div>

				<div class="col-sm-5">
				<div class="panel panel-default">
					<div class="panel-heading">Student Information</div>
					<div class="panel-body ">

						<table
							class="table table-condensed table-summary table-borderless ">
							<tbody>
								<tr>
									<td class="summary-heading"><b>First Name</b></td>
									<td class="summary-content">${applications.getStudent().getFirstName()}</td>
								</tr>


								<tr>
									<td class="summary-heading"><b>Last Name</b></td>
									<td class="summary-content">${applications.getStudent().getLastName()}</td>
								</tr>
								<tr>
									<td><b>Email</b></td>
									<td>${applications.getStudent().getEmail()}</td>
								</tr>
								<tr>
									<td><b>CIN</b></td>
									<td>${applications.getStudent().getCIN()}</td>
								</tr>
								<tr>
									<td><b>Gender</b></td>
									<td>${applications.getStudent().getGender()}</td>
								</tr>
								<tr>
									<td><b>Date of Birth</b></td>
									<td>${applications.getStudent().getDateofbirth()}</td>
								</tr>
									<tr>
									<td><b>Phone No.</b></td>
									<td>${applications.getStudent().getPhone()}</td>
								</tr>
									<tr>
									<td><b>Citizenship</b></td>
									<td>${applications.getStudent().getCitizenship() }</td>
								</tr>
							
							</tbody>
						</table>


					</div>
				</div>

			</div>
	
			<div class="col-sm-5">

				<div class="panel panel-default">
					<div class="panel-heading">Additional Requirements</div>
					<div class="panel-body ">

						<table
							class="table table-condensed table-summary table-borderless ">
							<tbody>
								<tr>
									<td class="summary-heading"><b>GPA</b></td>
									<td class="summary-content">${applications.getStudent().getEducationBackground().getGpa()}</td>
								</tr>
								<tr>
									<td><b>TOFEL</b></td>
									<td>${applications.getStudent().getEducationBackground().getToefl() }</td>
								</tr>
								<tr>
									<td><b>GRE</b></td>
									<td>${applications.getStudent().getEducationBackground().getGre()}</td>
								</tr>
								<tr>
									<td><b>TRANSCRIPT</b></td>
									<td><a href = "download.html"><${applications.getStudent().getEducationBackground().getTranscript()}</a></td>
								</tr>
							
							</tbody>
						</table>


					</div>
				</div>

			</div>

		</div>
	</div>
	
</body>
</html>