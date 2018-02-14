package com.java.model;

public class Teacher1 {

	private String id;
	private String name;
	private Student student;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}

	/*
	public void setStudent(Student student) {
		this.student = student;
	}
*/
	public void printDetails() {
		System.out.println(this.id + " " + this.name+ ","+ this.getStudent().getName());
	}

}
