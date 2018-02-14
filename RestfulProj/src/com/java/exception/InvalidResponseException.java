package com.java.exception;

public class InvalidResponseException extends RuntimeException{

	private static final long serialVersionUID = -3805979533451740921L;

	public InvalidResponseException(String message){
		super(message);
	}
}
