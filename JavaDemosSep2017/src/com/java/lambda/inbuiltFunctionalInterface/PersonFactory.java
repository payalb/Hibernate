package com.java.lambda.inbuiltFunctionalInterface;

import java.util.ArrayList;
import java.util.List;

public class PersonFactory {

	public static List<Person> createPersons() {
		List<Person> list= new ArrayList<>();
		Person p1= new Person(1, "Kirti");
		Person p2= new Person(2, "Shreya");
		Person p3= new Person(3, "Ravi");
		Person p4= new Person(4, "Deepti");
		Person p5= new Person(5, "Sheena");
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		return list;
	}

}
