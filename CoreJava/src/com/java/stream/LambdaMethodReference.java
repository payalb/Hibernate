package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import com.java.entity.Person3;

public class LambdaMethodReference {
	LambdaMethodReference(){
		System.out.println("In Constructor");
	}

	public static void main(String[] args) {
	
			Person3 obj1 = new Person3("sfddf",null, com.java.entity.Person3.Sex.MALE, "sdfds@jfdkjfd.com");
			Person3 obj2 = new Person3("sfddf",null, com.java.entity.Person3.Sex.MALE, "sdfds@jfdkjfd.com");
			Person3 obj3 = new Person3("ghghf",null, com.java.entity.Person3.Sex.FEMALE, "gfhgf@jfdkjfd.com");
			List<Person3> peopleList= Arrays.asList(obj1, obj2, obj3);
			printName(peopleList, Person3::getName);
	}
	
	private static void printName(List<Person3> peopleList,Function<Person3, String> f) {
	peopleList.forEach(p-> System.out.println(f.apply(p)));
		
	}

	public void print(){
		System.out.println("Hi");
	}
	
	public static List<Double> findSquareRoot(List<Integer> list, Function<Integer, Integer> f){
		List<Double> result = new ArrayList<>();
		list.forEach((t)->result.add(Math.sqrt(f.apply(t))));
		result.forEach(System.out::println);
		return result;
	}
	
	public static void printHello(){
		System.out.println("Hello");
	}
	
	

}
