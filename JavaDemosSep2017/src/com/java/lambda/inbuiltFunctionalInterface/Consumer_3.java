package com.java.lambda.inbuiltFunctionalInterface;

import java.util.List;
import java.util.function.Consumer;

public class Consumer_3 {

	public static void main(String[] args) {
		List<Person> persons = PersonFactory.createPersons();
		printDetails(persons);
	}

	public static void printDetails(List<Person> persons) {
		// Consumer represents a function, takes in 1 argument, act	s on it and
		// returns nothing
		Consumer<Person> consumer = new Consumer<Person>() {

			@Override
			public void accept(Person t) {
				System.out.println(t);
			}
		};
		persons.forEach(consumer);
		Consumer<Person> consumer1 = t -> System.out.println(t);
		persons.forEach(consumer1);
	}
}