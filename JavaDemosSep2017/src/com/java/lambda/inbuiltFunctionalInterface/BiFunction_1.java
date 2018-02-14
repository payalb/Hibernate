package com.java.lambda.inbuiltFunctionalInterface;

import java.util.function.BiFunction;

public class BiFunction_1 {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> function= (x,y)->  "Result is "+ (x+y);
		System.out.println(function.apply(4, 5));
	}
	
}