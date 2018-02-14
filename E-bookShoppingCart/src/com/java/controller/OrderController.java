package com.java.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.model.Order;
import com.java.model.OrderDao;
import com.java.model.OrderDaoImpl;


public class OrderController extends HttpServlet{
	
	OrderDao dao= new OrderDaoImpl();
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	//@TODO should be able to place an order in db based on the request parameters
		//Order should get saved in the database. 
		//It should 
		Order obj=new Order();
		obj.setCustomerEmail(request.getParameter("customerEmail"));
		obj.setCustomerPh(request.getParameter("customerPh"));
		obj.setCustomerName(request.getParameter("customerName"));
		obj.setQuantityOrdered(request.getParameter("quantityOrdered"));
		
		dao.placeOrder(obj);
		System.out.println("dao.getOrderDetails(3)");
		
		
	}

}
