package com.java.lambda.inbuiltFunctionalInterface;

import java.util.function.Predicate;

public class Predicate_1 {

	public static void main(String[] args) {
		// Predicate takes an argument, returns true or false.
		isPositive(5);
		isPositive(-5);
		
		Predicate<Integer> p= (t)->t>0;
		System.out.println(p.test(5));
	}

	public static void isPositive(int a) {
		Predicate<Integer> obj = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if (t < 0)
					return false;
				else
					return true;
			}

		};
		if (obj.test(a)) {
			System.out.println("Positive: " + a);
		} else {
			System.out.println("Negative: " + a);
		}
	}
}
