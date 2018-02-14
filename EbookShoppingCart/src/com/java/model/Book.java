package com.java.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	public Book( String title, String author, float price, int quantity
			) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String title;
	private String author;
	private float price;
	private int quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}
