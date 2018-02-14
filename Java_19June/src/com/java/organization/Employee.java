package com.java.organization;


public  class Employee{

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getAge() {
		return age;
	}

	public static void setAge(int age) {
		Employee.age = age;
	}

	private static int age;
 	
 	public static void main(String args[]){
 		Employee emp1= new Employee();
 		Employee emp2= new Employee();
 		
 		emp1.setName("Payal");
 		Employee.setAge(10);
 		emp2.setName("Ritu");
 		Employee.setAge(20);
 		
 		System.out.println(emp1.name+ ","+ Employee.age);
 		System.out.println(emp2.name+ ","+ Employee.age);
 	}
}


