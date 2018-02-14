package com.java.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addUser")
public class UserController extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		System.out.println(request.getLocalAddr());
		System.out.println(request.getPathInfo());
		System.out.println(request.getRemoteAddr());
		System.out.println(request.getLocale());
		response.getWriter().println("From controller before redirect");
		response.sendRedirect("home.jsp");
		System.out.println("back!!");
		response.getWriter().println("From controller after redirect");
	}
}
