package com.java.business;

import com.java.model.Employee;
import com.java.model.Teacher;

//Target class
public class MessageProcessor {
	
	private Employee employee;
	private Teacher teacher;

	public String processMessage(int i){
		System.out.println("Hello, my first app");
		if(i<100){
			return "valid!!";
		}
		throw new RuntimeException("Invalid number");
	}

	public void printMessage(){
		System.out.println("Method without service implementation...");
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
}
