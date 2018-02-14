package com.java.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PhoneNumber {
	
	@Override
	public String toString() {
		return "PhoneNumber [code=" + code + ", number=" + number + "]";
	}
	private int code;
	@Id
	private long number;
	public PhoneNumber() {
		super();
	}
	/*@ManyToOne(cascade=CascadeType.PERSIST)
	private Student student;*/
	public PhoneNumber(int code, long number) {
		super();
		this.code = code;
		this.number = number;
	}
	public int getCode() {
		System.out.println("getCode called!");
		return code;
	}
	public void setCode(int code) {
		System.out.println("setcode called!");
		this.code = code;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}

	/*public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}*/
	/*public String toString(){
	//	return this.getCode()+ " ,"+ this.getNumber()+", "+ this.getStudent().getId()+ ", "+ this.getStudent().getLocation()+ " ,"+ this.getStudent().getName();
	}*/
	

}
