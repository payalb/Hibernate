package com.java.lambda;

import java.util.Arrays;
import java.util.List;

public class Three {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		numbers.stream().map(e-> String.valueOf(e)).forEach(System.out::println);
		
		//Reference to static method
		numbers.stream().map(String::valueOf).forEach(System.out::println);
		
		numbers.stream().map(String::valueOf).map(e-> e.toString()).forEach(System.out::println);
		//Reference to instance method
		numbers.stream().map(String::valueOf).map(String::toString).forEach(System.out::println);
	}

}
