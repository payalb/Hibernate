package com.java.model;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
@XmlRootElement
public class Profile {
	
	private String name;
	private String email;
	private Map<Long, Message> message= new HashMap<Long, Message>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/*
	 * Ignore message when profile object is getting printed.
	 * from both xml, json
	 */
	@XmlTransient
	public Map<Long, Message> getMessage() {
		return message;
	}
	public void setMessage(Map<Long, Message> message) {
		this.message = message;
	}

}
