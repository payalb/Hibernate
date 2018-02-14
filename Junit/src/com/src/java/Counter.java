package com.src.java;

public class Counter {
	
	private static int counter;
	
	public int increment(){
		counter++;
		return counter;
	}
	public int decrement(){
		counter--;
		return counter;
	}
	protected void setCounter(int counter) {
		Counter.counter= counter;
		
	}
}
