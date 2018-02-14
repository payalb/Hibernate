package com.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



//Should be used to store order details in db.
@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String customerName;
@OneToOne
private Book book1;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public String getCustomerPh() {
	return customerPh;
}
public void setCustomerPh(String customerPh) {
	this.customerPh = customerPh;
}
public String getQuantityOrdered() {
	return quantityOrdered;
}
public void setQuantityOrdered(String quantityOrdered) {
	this.quantityOrdered = quantityOrdered;
}
public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public Book getBook1() {
	return book1;
}
public void setBook1(Book book1) {
	this.book1 = book1;
}
private String customerEmail;
private String customerPh;
private String quantityOrdered;
private Book book;
}
