package com.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Order1 {
	@Id//primary key
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
public String customerEmail;
public String customerPh;
public int quantityOrdered;

@OneToOne
private Book book;

public Book getBook() {
	return book;
}
public void setBook(Book book) {
	this.book = book;
}
public String customerName;

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
public int getQuantityOrdered() {
	return quantityOrdered;
}
public void setQuantityOrdered(int quantityOrdered) {
	this.quantityOrdered = quantityOrdered;
}

}
