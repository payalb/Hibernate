<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./login">Logout</a>
${headerMessage}<br/><br/>
${bean.username} and ${bean.password} is correct!<br/>

Your details are:<br/>
Date: ${bean.date}<br/>
List elements: ${bean.myList}<br/>
Set elements: ${bean.mySet} <br/>
ID: ${bean.id}<br/>

</body>
</html>