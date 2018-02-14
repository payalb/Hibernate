package com.java.model;

import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;


@Entity
@Access(value= AccessType.PROPERTY)
public class Student {

	private int id;
	private String name;
	private String location;

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
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@OneToMany(mappedBy="student", fetch=FetchType.LAZY)
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		System.out.println("setter called!");
		this.phoneNumbers = phoneNumbers;
	}

/*	public String toString(){
	//	return this.getId()+" , "+ this.getName()+" ,"+ this.getLocation()+" ,"+ this.getPhoneNumbers();
	}*/
}
