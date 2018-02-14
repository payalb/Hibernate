<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/RegisterUser" method="post">
Name : <input type="text" name="name"><br>
Age : <input type="text" name="age"><br>
EmailID : <input type="text" name="emailID"><br>
Phone Number : <input type="text" name="phoneNumber"><br>
Class <select name="standard">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
</select><br>
Password: <input type="password" name="password">

<input type="submit">
</form>
</body>
</html>