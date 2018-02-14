<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${headerMessage}<br/><br/><br/>
<form:errors path="bean.*"/><br/><br/>
<form action="/springMvcApp12/Validate.html" method="post">

Username:
<input type="text" name="username"/><br/>
Password:
<input type="password" name="password"/><br/>
Date:
<input type="text" name="date"/><br/>
Choose books:
<select name="myList" multiple="multiple">
<option>English</option>
<option>Hindi</option>
<option>Maths</option>
</select><br/>
Choose quantity:
<select name="mySet" multiple="multiple">
<option>10</option>
<option>20</option>
<option>30</option>
</select><br/>
Enter your id:
<input type="text" name="id"/><br/>
Enter Your address:<br/>
Street: <input type="text" name="address.street"/><br/>
Pincode: <input type="text" name="address.pincode"/><br/>
House Number: <input type="text" name="address.houseNumber"/><br/><br/><br/>
<input type="submit" value="Submit form"/>
</form>
</body>
</html>