package com.java.exceptions;

public class MyException extends RuntimeException{
	
	String message;
	MyException(String message){
		super(message);
		this.message= message;
		
	}

	@Override
	public void printStackTrace(){
		System.out.println(message);
	}
	@Override
	public String toString(){
		return message;
	}
}
