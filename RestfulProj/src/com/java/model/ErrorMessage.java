package com.java.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {
	
	public ErrorMessage(){
		
	}
	public ErrorMessage(int errorCode, String message){
		this.errorCode= errorCode;
		this.message= message;
	}
	private int errorCode;
	private String message;
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
