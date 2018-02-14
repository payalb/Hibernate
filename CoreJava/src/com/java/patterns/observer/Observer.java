package com.java.patterns.observer;

public interface Observer {
public void update(int price);
}

class Observer1 implements Observer{
	
	private Subject subject;
	
	Observer1(Subject subject){
		this.subject= subject;
		this.subject.register(this);
	}
	
	private int price;

	@Override
	public void update(int price) {
	this.price= price;
		
	}
	
}