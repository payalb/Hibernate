package com.java.lambda.inbuiltFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Function_2 {

	public static void main(String[] args) {
		Function<Integer, Double> function = (x) -> new Double(x);
		Function<Double, Double> function1 = (x) -> x*2.5;
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> list1 = new ArrayList<>();
		
		list.forEach(x->list1.add(function.andThen(function1).apply(x)));
		System.out.println(list1);
		list.stream().map(function.andThen(function1)).forEach(System.out::println);;
	}
}
//Used to create an output object based on a given input and the logic and chaining with other functions
	//andThen(Function after) => first applies its logic and then provided by function after 
	