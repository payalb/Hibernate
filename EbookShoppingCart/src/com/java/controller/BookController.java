package com.java.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.model.Book;
import com.java.model.BookDao;
import com.java.model.BookDaoImpl;

@WebServlet("/SearchBooks")
public class BookController extends HttpServlet{
	
	BookDao bookDb= new BookDaoImpl();
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String author_name= request.getParameter("author");
		String title= request.getParameter("title");
		List<Book> bookList= null;
		if(author_name!= "" && author_name != null){
			bookList	=bookDb.getBookByAuthor(author_name);
		}else if(title != null && title!=""){
			bookList= bookDb.getBookByTitle(title);
		}
		if(bookList==null){
			response.sendError(500,"Invalid request, please choose either author or title for search");
			request.getRequestDispatcher("./Index.jsp").forward(request, response);
		}else if(bookList.size()==0){
			response.sendError(520,"No book found! Try with other options..");
			request.getRequestDispatcher("./Index.jsp").forward(request, response);
		}else{
			request.getSession().setAttribute("books", bookList);
			request.getRequestDispatcher("./BookResult.jsp").forward(request, response);
		}
	}

}
