package com.java.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Student {
	@Id
	private int id;
	private String name;
	@OneToOne
//	@JoinColumn(name="address_id", referencedColumnName="code")
	private Address address;
	
	public String getName() {
		return name;
	}
	public void setName(String sName) {
		this.name = sName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String toString(){
		return this.getName()+", "+ this.getId()+" ,"+ this.getAddress().getCode()+", "+
	this.getAddress().getLocation();
	}

}
