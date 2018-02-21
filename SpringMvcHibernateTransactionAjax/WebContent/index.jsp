<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<title>Student Details</title>
</head>
<body>
<label>Enter id:</label>
<input type="text" title="Search for a student" id="stID"/>
<input type="button" value="Search" id="button1"/>
<br/>
<span id="stDetail"></span>
	<form action="./empsave.html" method="post">
		id <input type="text" name="id" /><br/>
		name <input type="text" name="name" /><br/>
		location <input type="text" name="location" /> <br/>
		Birthday<input type="date" name="birthday"/><br/>
		Phone <input type="tel" name="phone"/><br/>
		Email <input type="email" name="email"/><br/>
		<input type="submit"
			name="Save" />
	</form>
	<script type="text/javascript">
	$(document).ready(function(){
		$("#button1").click(function(){
		
			var id= $("#stID").val();
			$.ajax({
				type: 'GET',
				url: '${pageContext.request.contextPath}/emp/'+id+'.html',
				success: function(result){
				alert("success"+result);
					$("#stDetail").html(result);
				}});

		
		});
	});
	
	</script>
</body>
</html>