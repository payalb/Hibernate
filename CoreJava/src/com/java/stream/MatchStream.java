package com.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.java.entity.Gender;
import com.java.entity.Person;

public class MatchStream {

	public static void main(String[] args) {
		List<Person> list= createPersonList();
		list.stream().anyMatch(new Predicate<Person>() {

			@Override
			public boolean test(Person t) {
				// TODO Auto-generated method stub
				return t.getAge()>23;
			}
		});
		
		System.out.println(list.stream().anyMatch(p->p.getAge()>23));
		System.out.println(list.stream().allMatch(p-> p.getAge()>23));
		System.out.println(list.stream().noneMatch(p-> p.getAge()<21));
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
