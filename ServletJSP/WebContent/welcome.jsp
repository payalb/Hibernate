<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  isELIgnored="false" import="java.util.*, com.java.bean.User"%>
<!DOCTYPE html >
<html>
<body>
<% Map< User, String> map= new LinkedHashMap<>();
User user1= new User("payal","payal1");
map.put(user1,"Maths");
map.put( new User("admin", "admin"),"History");
request.setAttribute("user1", user1);

 %>
 ${map[user1]}
 ${map[user1].name}
</body>
</html>