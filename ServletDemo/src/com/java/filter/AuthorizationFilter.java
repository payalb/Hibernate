package com.java.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class AuthorizationFilter implements Filter{

	@Override
	public void destroy() {
		System.out.println("Filter removed!");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		String name= request.getParameter("uname");
		String password= request.getParameter("password");
		if(name.equalsIgnoreCase("Payal") && password.equalsIgnoreCase("Payal1")){
			chain.doFilter(request, response);
			
			System.out.println("Done!");
		}else{
			HttpServletResponse resp= (HttpServletResponse) response;
			//	resp.sendRedirect("error.jsp");
				resp.sendError(401, "Invalid user");
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
System.out.println("Filter Initialized!");		
	}

}
