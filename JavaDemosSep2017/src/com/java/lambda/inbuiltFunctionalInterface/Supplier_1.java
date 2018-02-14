package com.java.lambda.inbuiltFunctionalInterface;

import java.util.function.Supplier;

public class Supplier_1 {

	public static void main(String[] args) {
		// Supplier is a supplier of objects
		Supplier<Person> supplier = () -> new Person(1, "Kritika");
		Person person = supplier.get();
		System.out.println(person.name);
	}
}

