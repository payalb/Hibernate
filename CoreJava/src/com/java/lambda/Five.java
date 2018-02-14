package com.java.lambda;

import java.util.Arrays;
import java.util.List;

public class Five {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		//if even number, double the number and return sum.
		//Imperative style
		int result = 0;
		for(int i :numbers){
			if(i%2 == 0){
				result = result + i*2;
			}
		}
		System.out.println(result);
		
		//Stream api
		System.out.println(numbers.stream()
										.filter(i-> i%2==0)
										.map(e-> e*2)
										.reduce(0,Integer ::sum));
	}

}
