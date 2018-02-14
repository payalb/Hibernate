package com.java.lambda.inbuiltFunctionalInterface;

import java.util.function.BiConsumer;

public class BiConsumer_1 {

	public static void main(String[] args) {
		add(3, 4.2f);
	}

	public static void add(int a, float b) {
		BiConsumer<Integer, Float> biconsumer = new BiConsumer<Integer, Float>() {
			@Override
			public void accept(Integer t, Float u) {
				System.out.println(t + u);
			}
		};
		biconsumer.accept(a, b);
	}

}
