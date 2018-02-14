package com.java.lambda.inbuiltFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function_1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		Function<Integer, Double> function = (x) -> new Double(x);
		list.forEach(x-> System.out.println(function.apply(x)));
	};
}
// Used to create an output object based on a given input and the logic and
// chaining with other functions
// R apply(T t) => applies logic to T and returns R
