package com.java.business;

//Target class
public class MessageProcessor {
	
	public String processMessage(int i){
		System.out.println("Hello, my first app");
		if(i<100){
			return "valid!!";
		}
		throw new RuntimeException("Invalid number");
	}

	public void printMessage(){
		System.out.println("Method without service implementation...");
	}
}
