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
<style type="text/css">
.bs-example {
	margin: 20px;
}
</style>
	<script type = "text/javascript">
	$( document ).ready(function(){
		$("#ex3").change(function (e) {
			
            $.ajax({
                type: "POST",
                url: "getProgram.html",
                data: {department : $("#ex3").val()},
                success: function (data) 
                {
                    var appenddata = "";
                    $("#ddlprogram").html(''); 
                    var resultjson = JSON.parse(data);
                    var programd= resultjson.programs;
                    console.log(programd);
                    for (var i = 0; i < programd.length; i++) {
                    	console.log('in')
                    	appenddata += "<option value ='" + programd[i].p_id + "'>"+programd[i].p_name+"</option>";
                    }
                    $("#ddlprogram").append(appenddata);
                }
            });
        });
		
	});
	</script>



<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CreateApplication</title>
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
				<form action = "CreateApplication.html" method = "post" class="form-horizontal" role="form">
					<h2>Application Details </h2>
					<label for="ex3">Select Departments</label> <select
						class="form-control" id="ex3" name="department_id">

						<option value = "${department.d_id}">----Select Department-----</option>
						<c:forEach items="${departments}" var="department">
							
							<option value="${department.d_id}">${department.name}</option>
						</c:forEach>
					</select>
					<br/>
					<lable for="ex3"><b>Select Program</b></lable>
					<select class="form-control" id="ddlprogram" name="program">
					
					</select>
					<label for="exampleInputName2">Term</label> 
					<select class = "form-control" id = "term" name = "term">
					<option value = "Fall 2016">Fall 2016</option>
					<option value = "Spring 2016">Spring 2016</option>
					</select>
					<br/>								
					
					<input type="submit" value="Save&Next" class="btn btn-primary btn-sm"/>	
					
					
				</form>

			</div>
		</div>

	</div>

</div>

</body>
</html>