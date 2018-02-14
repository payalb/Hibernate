package com.java.test;

import java.util.ArrayList;

public class TicketClass {
	ArrayList<Ticket> ticketListArray =new ArrayList<Ticket>(); 
	private String transactionId;
	private String ticketClass;
	private int price;
	private String status;
	public static int firstclassCount = 5;
	public static int secondclassCount = 10;
	public static int sleeperclassCount = 50;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ArrayList<Ticket> getTicketListArray() {
		return ticketListArray;
	}
	public void setTicketListArray(ArrayList<Ticket> ticketListArray) {
		this.ticketListArray = ticketListArray;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getTicketClass() {
		return ticketClass;
	}
	public void setTicketClass(String ticketClass) {
		this.ticketClass = ticketClass;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
