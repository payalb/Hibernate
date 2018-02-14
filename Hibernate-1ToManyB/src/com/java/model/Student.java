package com.java.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String location;
	@OneToMany
	@JoinTable(name="student_PhoneNumber")
	private List<PhoneNumber> phoneNumbers;
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}
	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

/*	public String toString(){
	//	return this.getId()+" , "+ this.getName()+" ,"+ this.getLocation()+" ,"+ this.getPhoneNumbers();
	}*/
}
