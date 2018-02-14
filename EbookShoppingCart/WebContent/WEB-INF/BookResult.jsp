<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.java.model.Book, java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Books Found:</title>
</head>
<body>
<form action="./OrderController" method="post">
<table>
<tr><td>Select</td><td>Title</td><td>Author</td><td>Price</td><td>Quantity</td></tr>


<table>
    <c:forEach var="element" items="${listData}">
        <tr>
        	<td><input type="checkbox" name="select"></td>
            <td>${element.title}</td> 
            <td>${element.author}</td> 
            <td>${element.price}</td>
            <td><input type="text" name="quantity"></td>
        </tr> 
    </c:forEach>
</table>                          

<tr><td>Enter your name: </td><td><input type="text" name="custName"></td></tr>
<tr><td>Enter your email: </td><td><input type="text" name="custEmail"></td></tr>
<tr><td>Enter your phone-number: </td><td><input type="text" name="custNumber"></td></tr>
<tr><td/><td><input type="submit" value="Place Order"></td></tr>
<tr><td/><td><input type="reset" value="Clear"></td></tr>
</table>
</form>
</body>
</html>