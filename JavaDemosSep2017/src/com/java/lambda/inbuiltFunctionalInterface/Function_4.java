package com.java.lambda.inbuiltFunctionalInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function_4 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		

		applyIndentityToList(list, Function.identity());
	}

	private static void applyIndentityToList(List<Integer> list,
			Function<Integer, Integer> identity) {
		List<Integer> list1 = new ArrayList<>();
		list.forEach(t->list1.add(identity.apply(t)));
		System.out.println(list1);
	}
}
// Used to create an output object based on a given input and the logic and
// chaining with other functions
// identity : returns its own input argument
