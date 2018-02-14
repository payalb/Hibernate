<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
Cookie cookie1= new Cookie("sessionId",request.getSession(true).getId());
cookie1.setMaxAge(2000);
response.addCookie(cookie1);
Cookie cookie2= new Cookie("username","Payal1");
cookie2.setMaxAge(2000);
response.addCookie(cookie2);
response.sendRedirect("welcome.jsp");
 %>
</body>
</html>