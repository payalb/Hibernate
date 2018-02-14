package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java.entity.Gender;
import com.java.entity.Person;

public class Lambda3 {

		public static void main(String[] args) {

			Person p1= new Person("Anita", 22, Gender.FEMALE);
			Person p2= new Person("Ria", 25, Gender.FEMALE);
			Person p3= new Person("Ria", 22, Gender.FEMALE);
			Person p4= new Person("John", 22, Gender.MALE);
			Person p5= new Person("Raju", 22, Gender.MALE);
			
			List<Person> list= new ArrayList<>();
			list.add(p1);
			list.add(p2);
			list.add(p3);
			list.add(p4);
			list.add(p5);
			
			//Create a map using name and age as key and person object as value:
			
			list.stream().collect(Collectors.toMap(person -> person.getName() +" , "+ person.getAge(), person -> person));
			
			//Create map with name as the key and value as all people with same name.
			list.stream().collect(Collectors.groupingBy(Person::getName));
			
			//Create map with name as the key and value is all the ages of the people with same name
			list.stream().collect(Collectors.groupingBy(Person::getName, Collectors.mapping(Person::getAge, Collectors.toList())));
			
			List<Integer> numberList= Arrays.asList(1,2,3,5,4,4,6,7,8,9,10);
			//print number >3 and double of it if even
			System.out.println(numberList.stream().filter(e-> e>3).filter(e-> e%2==0).findFirst().map(e->e*2));
			//Lazy evaluation || efficient evaluation due to findFirst. If no findFirst, no computation would be done.
			System.out.println(numberList.stream().filter(Lambda3::filterGT3).filter(Lambda3::filterEven).findFirst().map(Lambda3::doubleElement));
			//No method called in below line
			System.out.println(numberList.stream().filter(Lambda3::filterGT3).filter(Lambda3::filterEven).map(Lambda3::doubleElement));
			
			//Stream features: sized(has boundary | unsized), ordered, distinct, sorted
			numberList.stream()
										.filter(e-> e>3)
										.filter(e-> e%2==0)
										.sorted()
										.distinct()
										.map(e->e*2)
										.forEach(System.out::println);
			
			//infinite stream : unsized, lazy
			System.out.println(Stream.iterate(100, e-> e+1));
			
			//get numbers from 121 , count=51, all even numbers, double them and print sum
			//limit : lazy till limit is reached. sum: eager
			//If return type of method is stream => lazy 
			System.out.println(Stream.iterate(121, e-> e+1).filter(e-> e%2==0).mapToInt(e-> e*2).limit(51).sum());
		}

		private static boolean filterGT3(int e){
			System.out.println(e);
			return e>3;
		}
		
		private static boolean filterEven(int e){
			System.out.println(e);
			return e%2==0;
		}
		private static int doubleElement(int e){
			System.out.println(e);
			return e*2;
		}
		
	}

