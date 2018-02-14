package com.java.model;

import javax.persistence.Embeddable;

@Embeddable
public class SubjectInfo {
	//@Column(name="name")
	private String name;
	private float marks;
	
	public SubjectInfo(){
		
	}
	public SubjectInfo(String name, float marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String sName) {
		this.name = sName;
	}

}
