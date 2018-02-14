<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./Success">
<jsp:useBean id="user" class="com.java.bean.User">
</jsp:useBean>
<jsp:setProperty property="*" name="user"/>
Please pay fees for the enrollment: <%= user.getStandard()*3000 %>

<input type="submit" value="Pay Now">
</form>
<form action= "./Login">
<input type="submit" value="Skip">

</form>
</body>
</html>