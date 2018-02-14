package com.java.lambda.inbuiltFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodRef_1 {

	public static void main(String[] args) {
		List<Object> list= Arrays.asList(1,2,3,4,5);
		//Instance variable
		Consumer<Object> consumer1= System.out::println;
		consumer1.accept("Hello World!");
	
		list.forEach(System.out::println);
		
		//static variable
		list.stream().map(String::valueOf).forEach(t->System.out.println(t.getClass()));
		//no change made to the list
		System.out.println(list.get(0).getClass());
		
		List<Integer> list1= Arrays.asList(1,2,3,4,5);
		//constructor reference
		list1.stream().map(Double::new).forEach(System.out::println);
	}
}
