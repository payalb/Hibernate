package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Stream;

//Method reference
public class TransformStream {

	public static void main(String args[]) {
		// List of names: printout the lengths of names

		// A ) Object methods : String str= "hello"; str.length();
		List<String> names = Arrays.asList("Ritu", "Shreya", "Payal");
	//	names.stream().mapToInt(e -> e.length()).forEach(System.out::println);
		//names.stream().mapToInt(String::length).forEach(System.out::println);

		// Static methods
		// List of names: printout the lengths of names whose length > 4
		// names.stream().map(e->e.length()).filter(e->
		// Integer.valueOf(e)>4).forEach(System.out::println);
		//names.stream().filter(e -> e.length() > 4).forEach(System.out::println);
		// Constructors

		// People array 3 people in it => print out the names of people greater than 20
		// years of age
		// People: id, name, age
		Student s1 = new Student(1, "Priya", 22);
		Student s2 = new Student(2, "Esha", 18);
		Student s3 = new Student(3, "Raj", 42);
		Student s4 = new Student(4, "Rahul", 17);
		List<Student> list = Arrays.asList(s1, s2, s3, s4);
		
	//	String[] arr1= new String[list.size()];
		String[] arr= list.stream()
		.filter(e->e.getAge()>20)
		.map(Student::getName).toArray((size)-> new String[size]);
		
		//Method reference to the constructor
		String[] arr1= list.stream()
				.filter(e->e.getAge()>20)
				.map(Student::getName).toArray(String[]::new);
		//toArray: array of object
		//toArray(String[size])
		//1, 2 => string array 
		
		//Method reference to a static method
		
		Stream.of(1,2).map(e->String.valueOf(e)).forEach(System.out::println);
		Stream.of(1,2).map(String::valueOf).forEach(System.out::println);
		
		
		for(String str: arr) {
			System.out.println(str);
		}
	}
}

class Student {

	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}