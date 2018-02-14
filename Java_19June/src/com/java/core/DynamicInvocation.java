package com.java.core;

public class DynamicInvocation {

	public static void main(String[] args) {
		Employee e1= new Manager();
		e1.printDetails();
		System.out.println(e1.name);
		//e1.printEmployeeNumber();
	}

} 

class Employee{
	 String name="Raj";
	 int age=23;
	public void printDetails(){
		System.out.println(name+""+ age);
	}
}

class Manager extends Employee{
	String name="Ria";
	private int noOfEmp=50; 
	@Override
	public void printDetails(){
		System.out.println(name+" "+ age+" "+ noOfEmp);
	}
	public void printEmployeeNumber(){
		System.out.println(noOfEmp);
	}
}