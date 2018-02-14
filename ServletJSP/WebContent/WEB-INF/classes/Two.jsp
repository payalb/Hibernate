<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import= "java.util.Date" %>
    <%@ page import="java.io.IOException" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSP Example 1</title>
</head>
<body>
The below code will print out current data
<%= new Date() %>
<%! String name= "Payal"; %>
<%!  public void jspInit(){
System.out.println("jsp initializing..");

}

public void jspDestroy(){
System.out.println("Overridden Destroy method invoked!");
}
  %>


<% jspDestroy(); %>

<%= name %>
<% out.println("This is the java code"); %><br>
<!-- Using a JSP to output the values returned by System.getProperty for various system properties 
such as java.version, java.home, os.name, user.name, user.home, user.dir etc. -->
<% out.println(System.getProperty("java.version")); %><br>
<% out.println(System.getProperty("java.home")); %><br>
<% out.println(System.getProperty("os.name")); %><br>
<% out.println(System.getProperty("user.name")); %><br>
<% out.println(System.getProperty("user.home")); %><br>
<% out.println(System.getProperty("user.dir")); %><br>
<!-- This is an HTML comment -->
//This is a java comment. Does not work for HTML/ JSP<br>
<% int temp= 34;
 %>
 
 <%= temp %>
</body>
</html> --%>

<h1>
Header1</h1>