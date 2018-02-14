<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Validating fields</title>
<%
String name= request.getParameter("username");
String pwd= request.getParameter("password");
 %>
<jsp:useBean id="userObj" scope="session" class="com.java.bean.User"></jsp:useBean>
<jsp:setProperty property="name" name="userObj" value="<%=name %>"/>
<jsp:setProperty property="password" name="userObj" value="<%=pwd %>"/>
Is this a valid user?? 
<% if( userObj.isValid() ){

response.sendRedirect("WelcomeFile.jsp");
}
%>


<%-- 
<%
if(name!= null && name != "" & name.equalsIgnoreCase("Payal")){
session.setAttribute("name", name);
session.setAttribute("pwd", pwd);


RequestDispatcher rd= request.getRequestDispatcher("WelcomeFile.jsp");
request.setAttribute("name", name);

rd.forward(request, response);
/* response.sendRedirect("WelcomeFile.jsp"); */
}else{
session.setAttribute("message", "Invalid User! Please login again.."+name);
response.sendRedirect("Login.jsp");
}
 %> --%>

</head>
<body>

</body>
</html>