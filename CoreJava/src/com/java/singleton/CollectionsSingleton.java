package com.java.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java.entity.Gender;
import com.java.entity.Person;

public class CollectionsSingleton {

	public static void main(String[] args) {
		List<Person> people= createPersonList();
		List<Person> list= Collections.singletonList(new Person("Anita", 22, Gender.FEMALE));
		people.removeAll(list);
		list.add(new Person("John", 22, Gender.MALE));
		list.remove(0);
		list.set(0, new Person("John", 22, Gender.MALE));
		System.out.println(people.size());
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
	
	private static List<Person> createPersonList1() {
		Person p1= new Person("Anita", 22, Gender.FEMALE);
		Person p2= new Person("Ria", 25, Gender.FEMALE);
		
		List<Person> peopleList1= new ArrayList<>();
		peopleList1.add(p1);
		//peopleList.add(p2);
		return peopleList1;
	}

}
