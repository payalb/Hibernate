package com.java.bean;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ValidateUser extends HttpServlet {
	User user;
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		request.getSession().invalidate();
		String name= request.getParameter("name");
		String password= request.getParameter("password");
		for(User user: Users.getUsers()){
			if(name.equalsIgnoreCase(user.getName() ) && password.equalsIgnoreCase(user.getPassword())){
				System.out.println("Extracting fees info");
					
				}
			}
		}
	}


