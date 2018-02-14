package com.java.lambda.inbuiltFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate_2 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(-5, -4, 0, 1, 2, 3, 4, 5);
		Predicate<Integer> p = (t) -> t > 0;
		list.stream().filter(p).forEach(System.out::println);
	}
}