package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFormServlet extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		PrintWriter out= response.getWriter();
		out.println("<html>");
		out.println("<form action='./Greet' method='post'>");
		out.println("Username: <input type='text' name='uname'/><br>");
		out.println("Password: <input type='text' name='password'/><br>");
		out.println(" <input type='submit' name='Submit'/><br>");
		out.println("</form>");
		out.println("</html>");
	}
}
