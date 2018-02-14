package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Java8Features1 {

	
	public static void main(String args[]) {

		List<Integer> list = (List<Integer>) Arrays.asList(2, 3, 6, 3, 4);
		// External Iterator
		for (int i : list) {
			System.out.println(i);
		}
		// Internal Iterator:: can be done sequentially/ in parallel/lazy::
		// polymorphism: concentrate on what to do rather than how.
		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}

		});

		// Using lambda: after arrow is the body of the method., on the left is
		// the parameter list
		list.forEach((Integer t) -> {System.out.println(t);});

		// when iterating over the Integer collection, will give integer only
		list.forEach((t) -> {
			System.out.println(t);
		});
		//paranthesis is optional for only single parameter. For zero or more than one, we need to place them.

		// can get rid of extra params
		list.forEach(t -> System.out.println(t));

		// If we use curly braces, we cannot have expression, we need statements
		// i.e. semi-colon in the end is must and without it, we cannot have a
		// statement. It must be an expression.

		/* list.forEach( t -> {System.out.println(t)}); */
		list.forEach(t -> {
			System.out.println(t);
		});

		// If just taking in param and passing it to function:Office based
		// pattern
		list.forEach(System.out::println);
		/*
		 * int sum=0; //To double each value in collection and return sum: //map
		 * can transform each element list.forEach(value -> { sum= value*2 +
		 * sum; System.out.println(sum); });
		 */

		System.out.println(list.stream().map(e -> e * 2)
				.reduce(0, (c, e) -> c + e));
		list.stream().map(e-> String.valueOf(e)).forEach(System.out::println);
		
	//	Can be converted to : 
		list.stream().map(String::valueOf).forEach(System.out::println);
		//Lambdas can be used where parameter is used as an argument for static method, instance method or target
		list.stream().map(String::valueOf).map(e->e.toString()).forEach(System.out::println);
		//Can be converted to:
		list.stream().map(String::valueOf).map(String::toString).forEach(System.out::println);
		//For returning a value, don't need to mention the return type.		
		
		
		/*-----------------------------------------------------------------------------------------*/
		//Two parameters as arguments:
	System.out.println(	list.stream().reduce(0, (total, e)-> Integer.sum(total, e)));
	//Here 0 is the initial value, total and e are two arguments. Can be changed to
	
	System.out.println(	list.stream().reduce(0, Integer::sum));
	
	//to concat the string:
	System.out.println(	list.stream().map(String::valueOf).reduce("", (finalString, e)-> finalString.concat(e)));
	
	//Can be reduced to:
	System.out.println(	list.stream().map(String::valueOf).reduce("", String::concat));
	
	/*-----------------------------------------------------------------------------------------*/
	//Function Composition:
	//double the even numbers and return sum:
	//stream: iterator
	System.out.println(	list.stream().filter(e-> e%2==0).map(e-> e*2).reduce(0, Integer::sum));
	
	System.out.println(	list.stream().filter(e-> e%2==0).mapToInt(e-> e*2).sum());
	//parallel stream: lot of thread and resources used to get answer faster. use when data size is big, computation is big.
	
	System.out.println(	list.parallelStream().filter(e-> e%2==0).mapToInt(e-> e*2).sum());
	
	//streams are abstraction. we cannot point to data in stream. 
	
	//filter: Stream<T> filter takes predicate <T>
	//map: transform elements. number of output = no. of input. input type can be very diff than output type,
	//Stream<T> map takes function<T, R> as argument to return Streanm<T>
	//reduce : takes 2 param, 1st of type T, 2nd is of type bifunction<R, T, R> to produce result R
	//sum, collect
	//double even values and put it in a list 
	List<Integer> filteredValue= new ArrayList<>();
		list.stream().filter(e-> e%2==0).map(e-> e*2).forEach(filteredValue::add);
	//For above requires shared mutability, should not be done. Need collector. filteredValue is a shared variable outside
	System.out.println(filteredValue);
	//collect: reduce operation. Here stream to list. can use toSet() to prevent duplicates.
	List<Integer> filteredValue1= list.stream().filter(e-> e%2==0).map(e-> e*2).collect(Collectors.toList());
	System.out.println(filteredValue1);
	}
}

interface I1{
	public int add(int a, int b);
}

interface Calc{
	public int printResult(I1 obj);
}

class A{
	
	/*Calc obj = new Calc(){

		@Override
		public int printResult(I1 obj) {
			return 0;
		}
		
	};*/
	
	
}