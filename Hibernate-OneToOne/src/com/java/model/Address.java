package com.java.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
 public class Address {
	@Id
	private char code;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	private String location;
	
	@ManyToOne
	private Student student;
	protected Address(){
		
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
	
	/*public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	*/
	
	
	public String toString(){
		return this.getLocation()+", "+ this.getCode()+ ", ";//+ this.getStudent();
	}

}
