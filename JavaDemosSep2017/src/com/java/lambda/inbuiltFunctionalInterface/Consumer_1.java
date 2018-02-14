package com.java.lambda.inbuiltFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_1 {

	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(1,2,3,4);
		printNumbers(numbers);
	}



public static void printNumbers(List<Integer> numbers){

	Consumer<Integer> consumer = (t)->print(t);
	numbers.forEach(consumer);
	
}
//doing same task as consumer
public static void print(Integer t){
	System.out.println(t);
}
}