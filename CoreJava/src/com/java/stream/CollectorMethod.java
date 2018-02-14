package com.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;
import java.util.stream.Collectors;

import com.java.entity.Gender;
import com.java.entity.Person;

public class CollectorMethod {

	public static void main(String[] args) {
		List<Person> peopleList= createPersonList();
		//Use partitioningBy 
		System.out.println(peopleList.stream().collect(Collectors.partitioningBy((Person p)-> p.getAge()>23)));
		
		//use groupingBy
		System.out.println(peopleList.stream().collect(Collectors.groupingBy(Person::getAge)));
		System.out.println(peopleList.stream().collect(Collectors.groupingBy((Person p)-> p.getAge()>23)));
		
		//using partioningBy and groupingBy with Collector as the param
		//Use partitioningBy 
				System.out.println(peopleList.stream().collect(Collectors.partitioningBy((Person p)-> p.getAge()>23, Collectors.counting())));
				
				//use groupingBy
				//obtain person of each gender and count by groupingBy
				System.out.println(peopleList.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.counting())));
				System.out.println(peopleList.stream().collect(Collectors.groupingBy((Person p)-> p.getAge()>23, Collectors.counting())));
				
				//obtain person of each gender and count by partioningBy and map names to uppercase 
				System.out.println(peopleList.stream().collect(Collectors.groupingBy(Person::getGender,Collectors.mapping(p-> p.getName().toUpperCase(), Collectors.toList()))));
				
				//-----------------------------------------------------------------------------------------------------------------
				
				//list of male persons using Collectors.toList()
				List<Person>list= peopleList.stream().filter(p-> p.getGender().equals(Gender.MALE)).collect(Collectors.toList());
				System.out.println(list);
				
				//Set of male persons using Collectors.toSet()
				Set<Person> set= peopleList.stream().filter(p-> p.getGender().equals(Gender.FEMALE)).collect(Collectors.toSet());
				System.out.println(set);
				
				//ArrayList of persons using Collectors.
				ArrayList<Person>list1= peopleList.stream().filter(p-> p.getGender().equals(Gender.MALE)).collect(Collectors.toCollection(ArrayList::new));
				System.out.println(list1);
				
				//Vector
				Vector<Person>list2= peopleList.stream().filter(p-> p.getGender().equals(Gender.MALE)).collect(Collectors.toCollection(Vector::new));
				System.out.println(list2);
				
				//stack
				Stack<Person>list3= peopleList.stream().filter(p-> p.getGender().equals(Gender.MALE)).collect(Collectors.toCollection(Stack::new));
				System.out.println(list3.peek());
				
				//hashset
				HashSet<Person>list4= peopleList.stream().filter(p-> p.getGender().equals(Gender.MALE)).collect(Collectors.toCollection(HashSet::new));
				System.out.println(list4);
				
				Map<Integer, Set<Person>> map= peopleList.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.toSet()));
				System.out.println(map);
				
				//----------------------------------------------------------------------------------------------------------
				
				List<String> list5= Arrays.asList("sfdfsd","sfsdfds","rtrtret","Fghgfh");
				String str= list5.stream().collect(Collectors.joining(";"));
				System.out.println(str);
				System.out.println(peopleList.stream().collect(Collectors.summingInt(Person::getAge)));
				System.out.println(peopleList.stream().mapToInt(Person::getAge).sum());
	}
	
	private static List<Person> createPersonList() {
		Person p1= new Person("Anita", 22, Gender.FEMALE);
		Person p2= new Person("Ria", 25, Gender.FEMALE);
		Person p3= new Person("Ria", 25, Gender.FEMALE);
		Person p4= new Person("John", 22, Gender.MALE);
		Person p5= new Person("Raju", 24, Gender.MALE);
		
		List<Person> peopleList= new ArrayList<>();
		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p3);
		peopleList.add(p4);
		peopleList.add(p5);
		return peopleList;
	}

}
