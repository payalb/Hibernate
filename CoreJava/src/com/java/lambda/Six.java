package com.java.lambda;

import java.util.Arrays;
import java.util.List;

public class Six {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(numbers.stream()
				.filter(e -> e%2 ==0)
				.mapToInt(Six::compute)
				.sum());
		
		//Run concurrently: Uses lot of threads and resources to get answer fast
		//When data-size / task computation is big enough
		System.out.println(numbers.parallelStream()
				.filter(e -> e%2 ==0)
				.mapToInt(Six::compute)
				.sum());
	}

	public static int compute(int number){
		return number *2;
	}
}
