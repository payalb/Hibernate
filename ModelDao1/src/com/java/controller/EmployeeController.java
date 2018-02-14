package com.java.controller;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.business.StudentBO;
import com.java.model.Student;

public class EmployeeController extends HttpServlet{
	
	
	private static final long serialVersionUID = 2464657406507522884L;
	private ConfigurableApplicationContext ctx;
	
	@Override
	public void init(){
		ctx= new ClassPathXmlApplicationContext("spring-bean2.xml");
		
		
	}
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		int id= Integer.parseInt(req.getParameter("id"));
		String name= req.getParameter("name");
		String location=req.getParameter("location");
		StudentBO bo= (StudentBO) ctx.getBean("bo");
		Student st= new Student();
		st.setId(id);
		st.setName(name);
		st.setLocation(location);
		int i= bo.createStudent(st);
		if(i!=0){
			resp.getWriter().println("success");
		}
		else{
			resp.getWriter().println("failure");
		}
	}
		
		@Override
		public void destroy(){
			ctx.close();
		}
	}
