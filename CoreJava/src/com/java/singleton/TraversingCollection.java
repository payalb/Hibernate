package com.java.singleton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import com.java.entity.Gender;
import com.java.entity.Person;

public class TraversingCollection {

	public static void main(String[] args) {
		
		/*Vector<Person> v= createPersonVector();
		Enumeration<Person> er1=v.elements() ;
		while(er1.hasMoreElements()){
			Person p= er1.nextElement();
			//Fail safe. No concurrent modification exception
			v.remove(p);
			System.out.println(v.size());
		}
		System.out.println(v);
		
		List<Person> list= createPersonList();
		Enumeration<Person> er= Collections.enumeration(list);
		while(er.hasMoreElements()){
			Person p= er.nextElement();
			list.remove(p);
			
		}*/
		/*List<Person> list= createPersonList();
		Iterator<Person> it= list.iterator();
		while(it.hasNext()){
			Person p= (it.next());
			list.remove(p);
		}*/
		
		List<Person> list= createPersonList();
		Iterator<Person> it= list.iterator();
		while(it.hasNext()){
			Person p= (it.next());
			it.remove();
			it.remove();
		}
		System.out.println(list);
	
	/*	List<Person> list1= createPersonList1();
		boolean x=list.removeAll(Collections.singletonList(list1));
		System.out.println(list);
		System.out.println(x);*/
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
	
	private static Vector<Person> createPersonVector() {
		Person p1= new Person("Anita", 22, Gender.FEMALE);
		Person p2= new Person("Ria", 25, Gender.FEMALE);
		Person p3= new Person("Ria", 25, Gender.FEMALE);
		Person p4= new Person("John", 22, Gender.MALE);
		Person p5= new Person("Raju", 24, Gender.MALE);
		
		Vector<Person> peopleList= new Vector<>();
		peopleList.add(p1);
		peopleList.add(p2);
		peopleList.add(p3);
		peopleList.add(p4);
		peopleList.add(p5);
		return peopleList;
	}
	
}
