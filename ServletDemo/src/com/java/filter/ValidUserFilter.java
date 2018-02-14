package com.java.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class ValidUserFilter implements Filter{
	
	String uname;
	String password;
	@Override
	public void destroy() {
		System.out.println("About to detroy ValidUserFilter filter..");
		uname= null;
		password= null;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.getParameter("name");
		//if valid
		chain.doFilter(request, response);
		//else{
		HttpServletResponse resp= (HttpServletResponse) response;
	//	resp.sendRedirect("error.jsp");
		resp.sendError(401, "Invalid user");
		//}
		System.out.println("done!!");
		resp.setContentType("text/html");
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("About to initialize ValidUserFilter filter..");
		uname="Default";
		password= "Password";
	}

}
