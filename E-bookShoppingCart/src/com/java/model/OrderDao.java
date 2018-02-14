package com.java.model;

public interface OrderDao {

	public abstract void placeOrder(Order order);

	public abstract Order getOrderDetails(int order_id);

}