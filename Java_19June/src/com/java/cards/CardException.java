package com.java.cards;

public class CardException extends Exception{

	
	private static final long serialVersionUID = 1L;
	private String ex;
	
	CardException(String ex){
		this.ex= ex;
	}
	
	public void printStackTrace(){
		
	}

}
