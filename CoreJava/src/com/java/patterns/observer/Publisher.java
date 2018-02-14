package com.java.patterns.observer;

import java.util.ArrayList;
import java.util.List;

//when many objects needs to be updated based on an event
//publisher need not know about observers

interface Subject{
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();
}
public class Publisher implements Subject{
private List<Observer> observers= new ArrayList<>();
private int price;
 	@Override
	public void register(Observer o) {
 		observers.add(o);
		
	}

	@Override
	public void unregister(Observer o) {
		observers.remove(observers.indexOf(o));
		
	}

	@Override
	public void notifyObserver() {
		for(Observer o: observers){
			o.update(price);
		}
		
	}
	
	public void setPrice(int price){
		this.price= price;
		notifyObserver();
	}

}
