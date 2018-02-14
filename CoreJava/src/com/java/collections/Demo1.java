package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List list= new ArrayList<>();
		Person p1= new Person(1, "p1");
		Person p2= new Person(2, "p2");
		list.add(p1);
		list.add(p2);
		Collections.sort( list);
		System.out.println(list);
		
	}

}
class Person  implements Comparable<Person>{
	int id; 
	String name;
	Person(int id, String name){
		this.id= id;
		this.name= name;
	}
	@Override
	public int compareTo(Person p) {
		return this.id- p.id;
	}
	@Override
	public String toString(){
		return this.id+","+ this.name;
	}
}
