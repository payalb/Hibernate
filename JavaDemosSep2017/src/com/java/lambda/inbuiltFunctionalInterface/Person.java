package com.java.lambda.inbuiltFunctionalInterface;

class Person {
	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public String toString(){
		return this.id +" ,"+ this.name;
	}
}
