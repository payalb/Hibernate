package com.java.model;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Value("1")
	private int rollNo;
	@Value("Payal")
	private String name;
	@Resource(name="subjects")

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
