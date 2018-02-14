package com.java.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	@Value("1")
	private String id;
	@Value("dshf")
	private String name;
	@Autowired
	private Student student;
	
	public Teacher(){
		
	}
	public Teacher(Student s){
		this.student =s;
	}
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
	/*
	public void setStudent(Student student) {
		this.student = student;
	}
*/
	public void printDetails() {
		System.out.println(this.id + " " + this.name+ ","+ this.getStudent().getName());
	}

}
