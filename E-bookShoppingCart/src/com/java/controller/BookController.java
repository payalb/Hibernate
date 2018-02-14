package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.model.BookDao;
import com.java.model.BookDaoImpl;
//import com.java..hibernation;


public class BookController extends HttpServlet{
	
	BookDao bookDb= new BookDaoImpl();
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		//BookDaoImpl p1=new BookDaoImpl();
		PrintWriter out = response.getWriter();
		BookDaoImpl o1= new BookDaoImpl();
		if(request.getParameter("author")=="" || request.getParameter("author")==null){
			String p1=(String)request.getSession().getAttribute("title");
		// String p1=request.getParameter("title");
	   response=(HttpServletResponse) o1.getBookByAuthor(p1);
		}
		else{
		 String p2=(String)request.getSession().getAttribute("author");
		 response= (HttpServletResponse) o1.getBookByTitle(p2);
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("./BookResult.jsp");  
		if (dispatcher != null){  
		dispatcher.forward(request, response);  
		}
		
		
	
	}

}
