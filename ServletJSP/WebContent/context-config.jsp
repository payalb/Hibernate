<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Enumeration, java.text.DateFormat,java.text.SimpleDateFormat, java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
public void jspInit() //1
{
System.out.println("In init method!"); //2
}

public void jspDestroy() //3
{
System.out.println("In destroy method!"); //4
}

public void _jspService() //5
{
System.out.println("In service method!"); //6
}
%>
 <%!
public int sum(int a, int b)
{
return a + b;
}
%>
<%! DateFormat fmt = new SimpleDateFormat("hh:mm:ss aa");
String now = fmt.format(new Date()); %>
<% 
Enumeration<String> params= application.getInitParameterNames();
while(params.hasMoreElements()){
String str=params.nextElement();
out.println(application.getInitParameter(str));
}

/* out.println(application.getAttribute("username"));
out.println(application.getAttribute("password")); */

 %>
</body>
</html>