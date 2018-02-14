package com.java.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GreetServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name= request.getParameter("uname");
		String password= request.getParameter("password");
		PrintWriter writer= response.getWriter();
		writer.println("<html>");
		writer.println("Welcome");
		writer.println(name);
		writer.println("</html>");
	}
}
