package com.java.model;

import java.util.List;

public class Teacher2 {

	private String id;
	private String name;
	private List<Student> students;
	
	
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

	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void printDetails() {
		System.out.println(this.id + " " + this.name);
		for(Student s: this.getStudents()){
			System.out.println(s);
		}
	}

}
