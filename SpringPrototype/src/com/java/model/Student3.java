package com.java.model;

import java.util.Map;

public class Student3 {

	private int rollNo;
	private String name;
	
	public void init(){
		System.out.println("Student object created!");
	}
	private Map <String, Integer> subjects;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Map<String, Integer> getSubjects() {
		return subjects;
	}
	public void setSubjects(Map<String, Integer> subjects) {
		this.subjects = subjects;
	}
	@Override
	public String toString(){
		return this.getName() +" ,"+ this.getRollNo()+", "+ this.getSubjects();
	}
}
