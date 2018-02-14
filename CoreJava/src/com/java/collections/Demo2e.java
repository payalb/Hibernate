package com.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class Demo2e {

	public static void main(String[] args) {
		Set<Person> set= new TreeSet<>();
		Person obj1= new Person(1,"djhdf");
		Person obj2= new Person(2,"djhdf");
		set.add(obj1);
		set.add(obj2);
		System.out.println(set.size());
		System.out.println(set);
	}

}
