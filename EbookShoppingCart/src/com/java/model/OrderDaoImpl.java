package com.java.model;

import org.hibernate.Session;

public class OrderDaoImpl implements OrderDao {
	
	DatabaseUtil util= new DatabaseUtil();
	
	/* (non-Javadoc)
	 * @see com.java.model.OrderDao#placeOrder(com.java.model.Order)
	 */
	@Override
	public void placeOrder(Order order){
		Session session= util.getSession();
		session.save(order);
		session.beginTransaction().commit();
		System.out.println("Order successfully placed!");
	}
	
	/* (non-Javadoc)
	 * @see com.java.model.OrderDao#getOrderDetails(int)
	 */
	@Override
	public Order getOrderDetails(int order_id){
		return null;
	}
	
	
}
