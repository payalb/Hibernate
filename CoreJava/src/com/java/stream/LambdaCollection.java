package com.java.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import com.java.Person;
import com.java.Person.Sex;
import com.java.entity.Person3;

public class LambdaCollection {

	public static void main(String[] args) {
		createList();
		createSet();
		createMap();
		createTreeMap();
	}

	private static void createList() {
		Person obj1 = new Person("sfddf",null, Sex.MALE, "sdfds@jfdkjfd.com");
		Person obj2 = new Person("sfddf",null, Sex.MALE, "sdfds@jfdkjfd.com");
		Person obj3 = new Person("ghghf",null, Sex.FEMALE, "gfhgf@jfdkjfd.com");
		List<Person> list = new ArrayList<>();
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		System.out.println("-----------Iterating list---------------------");
		list.forEach(System.out::println);
	}

	private static void createSet() {
		Person obj1 = new Person("sfddf",null, Sex.MALE, "sdfds@jfdkjfd.com");
		Person obj2 = new Person("sfddf",null, Sex.MALE, "sdfds@jfdkjfd.com");
		Person obj3 = new Person("ghghf",null, Sex.FEMALE, "gfhgf@jfdkjfd.com");
		Set<Person> set = new HashSet<>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		System.out.println("-----------Iterating set---------------------");
		set.forEach(System.out::println);
	}
	
	private static void createMap() {
		Map<String, String> map= new HashMap<>();
		map.put("ffds","dsfds");
		map.put("Sfdsf", "sdffds");
		//Without lambda expression
		map.forEach(new MyBiConsumer());
		//With Lambda
		map.forEach((key, value)->System.out.println(key +" - "+ value));
	}
	
	private static void createTreeMap() {
/*		Map<Person3, String> map= new TreeMap<>(new MyComparator());
		Person3 obj1 = new Person3("sfddf",null, com.java.entity.Person3.Sex.MALE, "sdfds@jfdkjfd.com");
		Person3 obj2 = new Person3("sfddf",null, com.java.entity.Person3.Sex.MALE, "sdfds@jfdkjfd.com");
		Person3 obj3 = new Person3("ghghf",null, com.java.entity.Person3.Sex.FEMALE, "gfhgf@jfdkjfd.com");
		map.put(obj1,"dsfds");
		map.put(obj2, "sdffds");
		map.put(obj3, "sdffds");
		System.out.println("---------------------Iterating Tree Map--------------------");
		
		//With Lambda
		map.forEach((key, value)->System.out.println(key +" - "+ value));*/
		
		Map<Person3, String> map= new TreeMap<>((p1,p2)-> p1.getName().compareTo(p2.getName()));
		Person3 obj1 = new Person3("sfddf",null, com.java.entity.Person3.Sex.MALE, "sdfds@jfdkjfd.com");
		Person3 obj2 = new Person3("sfddf",null, com.java.entity.Person3.Sex.MALE, "sdfds@jfdkjfd.com");
		Person3 obj3 = new Person3("ghghf",null, com.java.entity.Person3.Sex.FEMALE, "gfhgf@jfdkjfd.com");
		map.put(obj1,"dsfds");
		map.put(obj2, "sdffds");
		map.put(obj3, "sdffds");
		System.out.println("---------------------Iterating Tree Map--------------------");
		
		//With Lambda
		map.forEach((key, value)->System.out.println(key +" - "+ value));
		
	}

}

class MyBiConsumer implements BiConsumer<String, String>{

	@Override
	public void accept(String key, String value) {
		
		System.out.println(key +" - "+ value);
	}
	
}
class MyConsumer implements Consumer<Person>{

	@Override
	public void accept(Person person) {
		person.printPerson();
	}
}

