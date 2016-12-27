<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Degree</title>
</head>
<body>
<div class= "container">
	<div class="container-fluid">
		<div class="col-xs-5">
			<div class="form-group">
				<form  action="degreeEditApplication.html" method = "post" class="form-horizontal" role="form" enctype = "multipart/form-data">
				<h1>Education Background</h1>
					<label for="exampleInputName2">CollegeName</label>
					<input class="form-control" placeholder="College-Name" required = "required"  />	
					<br/>					
					<label for="exampleInputName2">Major</label> 
					<input name = "Major"   class="form-control" placeholder="Major" required="required">
					<br/>
					<label for="exampleInputName2">Start Date</label> 
					<input name = "StartDate" type="text"  class="form-control" placeholder="Start Date"/>
					<br/>
					<label for="exampleInputName2">End Date</label> 
					<input name = "EndDate" type="text"  class="form-control" placeholder="End Date" 
						/>
					<br/>
					<label for="exampleInputName2">Type</label> 
					<input name = "type" type="text" class="form-control"  placeholder="Type of Degree" />	
					<br/>									
			
				</form>

			</div>
		</div>
	</div>
	</div>	


</body>
</html>