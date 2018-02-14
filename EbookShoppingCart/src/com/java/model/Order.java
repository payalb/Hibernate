package com.java.model;

import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity(name="custOrder")
public class Order {
@ElementCollection
private Map<Book, Integer> book;
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String customerName;
private String customerEmail;
private String customerPh;

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

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Map<Book, Integer> getBook() {
	return book;
}
public void setBook(Map<Book, Integer> book) {
	this.book = book;
}

}
