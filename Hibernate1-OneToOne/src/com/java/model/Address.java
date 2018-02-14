package com.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	private char code;
	private String location;
	public Address(){
		
	}
	public Address(String location, char code) {
		super();
		this.location = location;
		this.code = code;
	}
	
	//private Student student;

	public char getCode() {
		return code;
	}
	public void setCode(char code) {
		this.code = code;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	public String toString(){
		return this.getLocation()+", "+ this.getCode();
	}

}
