package com.java.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class OrderDaoImpl implements OrderDao {
	

	@Override
	public void placeOrder(Order order){
		/*Configuration cfg = new Configuration();
		cfg.configure("hibernate2.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s = sf.openSession();*/
		Session session= DatabaseUtil.openSession();
		session.save(order);
		 session.beginTransaction().commit();
		  
		  session.evict(order);
		//session.close();
		//sf.close();
		//@TODO write code to save the order object in db.
	}
	
	
	@Override
	public Order getOrderDetails(int order_id){
		//@TODO wrote code to get order details from db based on the order Id
	/*	Configuration cfg = new Configuration();
		cfg.configure("hibernate2.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s = sf.openSession();*/
		Session session= DatabaseUtil.openSession();
		String hql = "FROM Order O WHERE O.id = order_id";
		Query query = session.createQuery(hql);
		List result1 = query.list();
		
		//s.close();
		return  (Order) result1;
		
	}
	
	
}
