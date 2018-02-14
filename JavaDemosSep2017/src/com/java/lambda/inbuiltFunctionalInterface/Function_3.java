package com.java.lambda.inbuiltFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function_3 {

	public static void main(String[] args) {
		Function<Integer, Double> function = (x) -> new Double(x);
		Function<Double, Double> function1 = (x) -> x*2.5;
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		List<Double> list1 = new ArrayList<>();
		
		list.forEach(x->list1.add(function1.compose(function).apply(x)));
		System.out.println(list1);
		list.stream().map(function1.compose(function)).forEach(System.out::println);
	}
}
//Used to create an output object based on a given input and the logic and chaining with other functions
	//compose(Function before) => first applies before logic and then it's own
	