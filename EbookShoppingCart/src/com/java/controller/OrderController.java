package com.java.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Response.Status;

import com.java.model.Book;
import com.java.model.Order;
import com.java.model.OrderDao;
import com.java.model.OrderDaoImpl;
@WebServlet("/PlaceOrder" )
public class OrderController extends HttpServlet{
	
	OrderDao dao= new OrderDaoImpl();
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Order order= new Order();
		Map<Book, Integer> booksOrderPlaced= new HashMap<>();
		String customerName= request.getParameter("custName");
		String customerEmail= request.getParameter("custEmail");
		String customerPh= request.getParameter("custNumber");
		String id=  request.getParameter("id");
		List<Book> books= (List<Book>) request.getSession().getAttribute("books");
		
		Enumeration<String> enums= request.getParameterNames();
		while(enums.hasMoreElements()){
			System.out.println(enums.nextElement());
		}
		for(Book book: books){
			
			if(request.getParameter(""+book.getId())!= null && request.getParameter(""+book.getId()).equals("on")){
				System.out.println("Book selected with id: "+ book.getId());
				booksOrderPlaced.put(book, Integer.parseInt(request.getParameter("qty"+ book.getId())));
			}
		}
		
		order.setBook(booksOrderPlaced);
		order.setCustomerEmail(customerEmail);
		order.setCustomerName(customerName);
		order.setCustomerPh(customerPh);
		dao.placeOrder(order);
		response.setStatus(100, "Successfully placed order!");
		request.getRequestDispatcher("./Index.jsp").forward(request, response);
	}

}
