<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%@include file="header.jsp" %> --%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Include JSP example</title>
</head>
<body>
Include jsp example

<% application.getRequestDispatcher("ServletJSP/error.jsp").forward(request, response);
	/* request.getRequestDispatcher("error.jsp").forward(request, response);
application.getNamedDispatcher("error.jsp").forward(request, response); */
 %>
</body>
</html>