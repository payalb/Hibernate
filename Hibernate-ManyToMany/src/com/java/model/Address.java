package com.java.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Address {
	
	private String street;
	private String city;
	@Id
	private long number;
	@ManyToMany(mappedBy="addresses")
	private List<Student> students;
	
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}

	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString(){
		String addressInfo=  this.getNumber()+", "+ this.getCity()+", "+this.getStreet();
		for(Student student: this.getStudents()){
			addressInfo= addressInfo+" ,"+ student.getId()+", "+ student.getName();
		}
		return addressInfo;
	}
	

}
