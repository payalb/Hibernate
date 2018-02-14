package com.java.dao;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class MyObject {
	
	public MyObject(){
		super();
	}
	
	public MyObject(int id, String name){
		this.id= id;
		this.name= name;
	}
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
