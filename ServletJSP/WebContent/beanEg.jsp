<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="com.java.bean.User" scope="request"></jsp:useBean>
<% String name= request.getParameter("name"); %>
<jsp:setProperty property="name" name="user" value="<%= name %>"/>
<% String password= request.getParameter("password"); %>
<jsp:setProperty property="password" name="user" value="<%= password %>"/>

<%= user.getDetails() %>
 <jsp:forward page="userDetail.jsp"></jsp:forward>

</body>
</html>