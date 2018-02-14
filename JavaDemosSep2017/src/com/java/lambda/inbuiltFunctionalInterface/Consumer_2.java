package com.java.lambda.inbuiltFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer_2 {

	public static void main(String[] args) {
		List<Integer> numbers= Arrays.asList(1,2,3,4);
		printNumbers(numbers);
	}



public static void printNumbers(List<Integer> numbers){
	//Consumer represents a function, takes in 1 argument, acts on it and returns nothing
	Consumer<Integer> consumer= new Consumer<Integer>(){

		@Override
		public void accept(Integer t) {
			System.out.println(t);
		}
		
	};
	numbers.forEach(consumer);
	Consumer<Integer> consumer1= t->System.out.println(t);
	numbers.forEach(consumer1);
	
}
}