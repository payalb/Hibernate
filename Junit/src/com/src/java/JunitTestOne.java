package com.src.java;

public class JunitTestOne {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		double result = calculator.add(10,50);
		System.out.println(result);
		if (result != 60) {
		System.out.println("Bad result: " + result);
		throw new IllegalStateException("Bad result"+result);
		}

	}

}
