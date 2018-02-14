package com.java;

public class Employee {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return this.id +", "+ this.name;
	}
	
}
