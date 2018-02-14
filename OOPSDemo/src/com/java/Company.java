package com.java;


// 1) Class: template
//2) Properties.. fields
//3) methods.. functionalities
// create object : new operator
//properties: private
//methods: public
//access modifiers: public, private, protected, default
public class Company {
	
	
	private String name;
	static String address;
	int noOfEmployees;
	int noOfDepartments;
	
	{	int a= 5;
	}
	public void setName(String name){
		noOfDepartments= 6;
		this.name= name;
	}
	public void provideService(){
		int count= 5;
		System.out.println("Doing projects!!");
	}
}


interface CompanyInterface{
	public void provideService();
}