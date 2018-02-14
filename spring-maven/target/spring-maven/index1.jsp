<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
<form:form action="./Validate.html" method="post" modelAttribute="login">
<h2>Fill in the below form:</h2>
<h4>Name:</h4><form:input type="text" path="username"/>
<br>
<h4>Password:</h4><form:input type="password" path="password"/>
<br>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>
