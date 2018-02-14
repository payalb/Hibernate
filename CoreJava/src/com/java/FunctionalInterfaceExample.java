package com.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class FunctionalInterface1 {

	public static void main(String args[]) {
		createThreadUsingAnonymousClass();
		createThreadUsingLambda();

		iterateThroughListUsingAnonymousFI();
		iterateThroughListUsingLambda();
		iterateThroughListUsingMethodReference();

		MethodWithParamWithoutLambda();
		MethodWithParamWithLambda();

	}

	private static void MethodWithParamWithoutLambda() {
		MyInterface obj = new MyInterface() {

			@Override
			public int add(int a, int b) {
				return a + b;
			}
		};
		System.out.println(obj.add(3, 4));
	}

	private static void MethodWithParamWithLambda() {
		MyInterface obj = (a, b) -> a + b;
		System.out.println(obj.add(3, 4));
		obj.printHello();
		obj.printHi();
		MyInterface.printWorld();
	}

	@FunctionalInterface
	interface MyInterface {

		int add(int a, int b);
		public int hashCode();
		public boolean equals(Object o);
		default public void printHi() {
			System.out.println("Hi");
		}
		default public void printHello() {
			System.out.println("Hello");
		}
		static void printWorld() {
			System.out.println("Hello World!");
		}
	}

	private static void iterateThroughListUsingMethodReference() {
		List<String> names = Arrays
				.asList("jdhjd", "dsfds", "dfdsfd", "eueure");
		names.forEach(System.out::println);

	}

	private static void iterateThroughListUsingLambda() {
		List<String> names = Arrays
				.asList("jdhjd", "dsfds", "dfdsfd", "eueure");
		names.forEach((t) -> System.out.println(t));
	}

	private static void iterateThroughListUsingAnonymousFI() {

		List<String> names = Arrays
				.asList("jdhjd", "dsfds", "dfdsfd", "eueure");
		names.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}

		});

	}

	private static void createThreadUsingLambda() {
		Thread t = new Thread(() -> System.out.println("running.."));
		t.start();
	}

	private static void createThreadUsingAnonymousClass() {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("Running..");
			}
		};

		Thread t = new Thread(runnable);
		t.start();
	}

	/* System.out.println(obj.add(3,4)); */
}