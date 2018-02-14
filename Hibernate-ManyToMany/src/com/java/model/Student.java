package com.java.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	@ManyToMany
	@JoinTable(name="student_address")
	private List<Address> addresses;
	
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

	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public String toString(){
		String studentInfo= this.getId()+" , "+ this.getName()+" ,";
		for(Address address: this.getAddresses()){
			studentInfo= studentInfo+" ,"+ address.getNumber()+", "+ address.getCity()+" ,"+ address.getStreet();
		}
		return studentInfo;
	}
}
