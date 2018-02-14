package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Stream;

import com.java.entity.Gender;
import com.java.entity.Person;


public class TransformStream {

	public static void main(String[] args) {
			//Map: to convert one type to other
		//Find length of each string and change stream from string to int containing length
		List<String> list=  Arrays.asList("dfdsf","sfdsdf","dfsdf","fdfsd");
		list.stream().map(String::length).filter(i->Integer.valueOf(i)>5).forEach(System.out::println);
		
		//filter to get all persons whose age >23
		List<Person> peopleList= createPersonList();
		peopleList.stream().filter(p-> p.getAge()>23).map(Person::getName).forEach(System.out::println);
		
		//Transform list to object array
		Object[] peopleArray= peopleList.stream().filter(p-> p.getAge()>23).map(Person::getName).toArray();
		//Transform list to person array
		//Below will create a new Array of given size and populate it with stream values
		String[] peopleArray1= peopleList.stream().filter(p-> p.getAge()>23).map(Person::getName).toArray(new IntFunction<String[]>() {
			@Override
			public String[] apply(int size) {
				return new String[size];
			}
		});
		String[] peopleArray2= peopleList.stream().filter(p-> p.getAge()>23).map(Person::getName).toArray(String[]::new);
//		 The toArray(IntFunction<A[]> generator) method returns an array containing the elements of this stream, using the provided generator function to allocate the returned array.

		 String[] stringArr = { "a", "b", "c", "d" };
		 Stream<String> stream = Stream.of(stringArr);
		 String[] arr = stream.toArray(size -> new String[size]);
		 System.out.println(Arrays.toString(arr));
		  
		 String str = "101010";
		// str.chars().mapToObj(c-> c=='1'?true:false).toArray(Boolean::new);
		 
		Boolean[] arr2= str.chars().mapToObj(c-> c=='1'?true:false).toArray(Boolean[]::new);
		 System.out.println(Arrays.asList(arr2));
	}
	

	private static List<Person> createPersonList() {
		Person p1= new Person("Anita", 22, Gender.FEMALE);
		Person p2= new Person("Ria", 25, Gender.FEMALE);
		Person p3= new Person("Ria", 22, Gender.FEMALE);
		Person p4= new Person("John", 22, Gender.MALE);
		Person p5= new Person("Raju", 22, Gender.MALE);
		
		List<Person> peopleList= new ArrayList<>();
		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p3);
		peopleList.add(p4);
		peopleList.add(p5);
		return peopleList;
	}

}
