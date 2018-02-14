<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Login Form</title>
</head>
<body>

<h2><form:errors path="bean.*" /></h2>
<form:form action="./Validate" method="post" modelAttribute="bean">
${bean.username}
Date of registration: <form:input path="date"/>
Choose books: <form:select  multiple="true" path="myList">
<form:option value="English">English</form:option>
<form:option value="Hindi">Hindi</form:option>
<form:option value="Maths">maths</form:option>
</form:select>
Choose quantity:
<form:select multiple="true" path="mySet" >
<form:option value="10">10</form:option>
<form:option value="20" >20</form:option>
<form:option value="30" >30</form:option>
</form:select><br/>
Enter your id:
<form:input path="id"/><br/>
<input type="submit"/>
</form:form>
</body>
</html>