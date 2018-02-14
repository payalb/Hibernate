package com.java.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Key implements Serializable{
	
	private static final long serialVersionUID = 1L;
	//Composite key class must be serializable
	private String name;
	private String location;
	
	public Key(String name, String location) {
		this.name= name;
		this.location= location;
	}
	public String getName() {
		return name;
	}
	public void setName(String sName) {
		this.name = sName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
