<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<form action="./validateForm.jsp" method="post">
<% 
//
if(session!=null && session.getAttribute("message")!= null){
String message= session.getAttribute("message").toString().trim();
out.println(message);
}
 %>
Username: <input type="text" name="username">

Password: <input type="text" name="password">

<input type="submit">

</form>
</body>
</html>