package com.java.lambda;

import java.util.Arrays;
import java.util.List;

public class Seven {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//Filter:output = 0 or  <= number of elements in input
		numbers.stream().filter(e-> e%2 ==0);
		//Filter: Takes predicate(Interface) of type t as input
		
		//Map : Transforming function
		//Number of output = number of input.
		//No guarantee on type of output with respect to type of input
		numbers.stream().map(e -> e*2);
	}

}
