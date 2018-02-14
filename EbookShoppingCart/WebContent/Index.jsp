<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shopping Cart</title>
</head>
<body>
<h1>Welcome to the E-book Shopping Center</h1>
<form action="./SearchBooks" method="post">
<table>
<tr><td>Choose the Author:</td>
<td><select name="author">
<option><option>
<option>Stephen King</option>
<option>J.K.Rowling</option>
<option>William Shakespeare</option>
<option>Mark Twain</option>
</select></td>
</tr>
<tr>
<td>
OR
</td>
</tr>

<tr>
<td>Search by Title:</td>
<td><input type="text" name="title"></td>
</tr>

<tr>
<td/>
<td> <input type="submit" name="search" value="Search"/> 
<input type="reset" value="Clear" />
</td>
</tr>
</table>
</form>
</body>
</html>