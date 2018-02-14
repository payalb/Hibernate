<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login form</title>
</head>
<body>
${headerMessage}<br/><br/><br/>
<a href="/springMvcApp15/login?lang=en">English</a>
<a href="/springMvcApp15/login?lang=fr">French</a>
<form:errors path="bean.*"/><br/><br/>
<form action="/springMvcApp15/Validate.html" method="post">

<spring:message code="label.username"/>
<input type="text" name="username"/><br/>
<spring:message code="label.password"/>
<input type="password" name="password"/><br/>
<spring:message code="label.date"/>
<input type="text" name="date"/><br/>
<spring:message code="label.books"/>
<select name="myList" multiple="multiple">
<option>English</option>
<option>Hindi</option>
<option>Maths</option>
</select><br/>
<spring:message code="label.quantity"/>
<select name="mySet" multiple="multiple">
<option>10</option>
<option>20</option>
<option>30</option>
</select><br/>
<spring:message code="label.id"/>
<input type="text" name="id"/><br/>
<spring:message code="label.address"/><br/>
<spring:message code="label.street"/><input type="text" name="address.street"/><br/>
<spring:message code="label.pincode"/><input type="text" name="address.pincode"/><br/>
<spring:message code="label.houseNumber"/><input type="text" name="address.houseNumber"/><br/><br/><br/>
<input type="submit" value="Submit form"/>
</form>
</body>
</html>