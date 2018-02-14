package com.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Two {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// External iterator to iterate over the collection
		for (int i = 0; i <= numbers.size(); i++) {
			System.out.println(i);
		}

		// advanced external iterator
		for (Integer i : numbers) {
			System.out.println(i);
		}

		// Internal Iterator
		numbers.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		
		numbers.forEach((Integer t)->System.out.println(t));
		
		//Type inference for lambda expression
		numbers.forEach((t)->System.out.println(t));
		
		//If single parameter can remove parenthesis
		numbers.forEach(t->System.out.println(t));
		
		//Receive number and printing it out. If need to update the value, cannot
		//use method reference
		//Method reference
		numbers.forEach(System.out::println);
		
		numbers.forEach((i)-> System.out.println(i*5));
		//Cannot change to method reference
	}

}
