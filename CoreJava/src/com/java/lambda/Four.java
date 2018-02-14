package com.java.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Four {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		numbers.stream().reduce(0,new BinaryOperator<Integer>(){

			@Override
			public Integer apply(Integer t, Integer u) {
				//T is total, u is element
				return Integer.sum(t, u);
			}
		});
		
		numbers.stream().reduce(0,(t, u)-> Integer.sum(t,u));
		
		//Method reference for more than one parameter
		System.out.println(numbers.stream().reduce(0, Integer::sum));
	}

}
