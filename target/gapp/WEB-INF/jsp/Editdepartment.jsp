<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
<title>Edit Department</title>
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
		<form:form method = "post" class="form-horizontal"  modelAttribute="department">
  			<div class="col-xs-5">
  			<label for="ex3">Update Department</label>
 			 <form:input path ="Name"  class="form-control" id="ex3" ></form:input>
 			 <br/>
 			<input  type="submit" value="Update"
								class="btn btn-info btn-block" />
		
			</div>			
	</form:form>
	<form class="form-horizontal">
  			<div class="col-xs-5">
  			<label for="ex3">Update Program</label>
  			<br/>
 			
 			<c:forEach items = "${programs}" var = "program">
 			 <label>${program.p_Name}</label>
 			  <input type="hidden" name="Program_id" value="${program.p_id}"><br/>
 			 <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button><br/>
 			</c:forEach>
 			 <br/>
 			 
 			 
 			 <label for="ex3"> update Additional Requirement</label>
 			<button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
 			<div class="form-group">
 			
			
 			 
 			 </div>
 			 </div>
		</form>					
</body>
</html>