package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Site {
	
	public Site(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	private int id;
	private String name;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
