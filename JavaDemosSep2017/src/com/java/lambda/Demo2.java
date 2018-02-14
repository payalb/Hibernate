package com.java.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Demo2 {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		list.stream().filter(t -> t > 2).forEach(System.out::println);
		list.stream().map(t -> t * 2).filter(t -> t > 5)
				.forEach(System.out::println);
		Person p1 = new Person(1, 32.54f);
		Person p2 = new Person(2, 76.54f);
		Person p3 = new Person(3, 90.54f);
		List<Person> list1= new ArrayList<Person>();
		list1.add(p1);
		list1.add(p2);
		list1.add(p3);
		
	//	list1.stream().filter(p-> p.marks>60).map(p-> p.id).forEach(System.out::println);
		
		System.out.println(list1.stream().filter(p-> p.marks>60).count());
		// Display the id of those whose marks are greater than 60
		
		list1.stream().mapToDouble(p-> p.marks).max();
		
		Comparator<Float> c= new Comparator<Float>(){

			@Override
			public int compare(Float o1, Float o2) {
				return (int) (o1-o2);
			}
			
		};
		

	}
}

class Person {
	public Person(int i, float f) {
		this.id = i;
		this.marks = f;
	}

	int id;
	float marks;
}