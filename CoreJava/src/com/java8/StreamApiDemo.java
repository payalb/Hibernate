package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {
//Build a stream
	public static void main(String[] args) {
		
	/*	Map<Integer, Person> map= new HashMap<>();
		Person p1= new Person(1, "Payal");
		Person p2= new Person(2, "Ritu");
		map.put(1,p1);
		map.put(2,p2);
		
		Collections.sort(list, (o1, o2)->  o1.getName().compareTo(o2.getName()));
		//Stream
		map.keySet().stream().count();//2
		//terminal: end result 
		
		map.values().stream().filter(p-> p.getId()>=5);
		//intermediary
	map.entrySet().stream();
	
		int[] arr= new int[5];
		//Arrays.stream(arr);
*/		
	/*	String str ="Hello";
	//	H e l l o => h e l o
		//Arrays.stream(str.toCharArray());
		
		str.chars()
		.distinct()
		.mapToObj(e-> ((char)e+"").toLowerCase()).
		forEach(e-> System.out.println(e));
		
		
		Stream.of(str.split(""))
		.distinct()
		.map(e-> e.toLowerCase());
		*/
		
		
		//numbers from 1 to 30 : filter out even numbers: print them out: print odd numbers
		
//		Stream.iterate(1, t->++t).limit(30).filter(e-> e%2!=0).forEach(e-> System.out.println(e));
		
		
		//10 random numbers on a stream : print 
		
		Stream.generate(()->(int)(  Math.random()*10)).limit(10).forEach(x->System.out.println(x));	
		
		//Payal, Ritu, Shreya: Stream : lowercase: printed out => payal, ritu, shreya
		//Don't use collections/ Array
		
		Stream.of("Payal", "Ritu", "Shreya").
		map(m3 -> m3.toLowerCase()).
		forEach(e -> System.out.println(e));
		
		Stream.builder().add("Payal").add("Ritu").add("Shreya").build().
		map(m3 -> m3.toString().toLowerCase()).
		forEach(e -> System.out.println(e));

		
		}
	//	List<String> list= Stream.of(str.split("")).distinct().collect( Collectors.toList());
				
	

}

class Person{
	
	int id;
	String name;
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}