package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class Demo1c {

	public static void main(String[] args) {
		Set<Student> set= new HashSet<>();
		Student p1= new ArtStudent(1, "ddd");
		Student p2= new ScienceStudent(1, "ddd");
		set.add(p1);
		set.add(p2);
	
		System.out.println(set.size());
		System.out.println(set.contains(p2));
		System.out.println(set.contains(new Student(1, "ddd")));
		
		
	}

}
class Student{
	int id;
	String name;
	Student(int id, String name){
		this.id= id;
		this.name= name;
	}
	@Override
	public boolean equals(Object o){
		Student s= (Student)o;
		return s.id== this.id;
	}

	public int hashCode(){
		return this.name.substring(0,1).hashCode();
	}
}


class ArtStudent extends Student{
	ArtStudent(int id, String name){
		super(id, name);
	}
}
class ScienceStudent extends Student{
	ScienceStudent(int id, String name){
		super(id, name);
	}
}
class CommerceStudent extends Student{
	CommerceStudent(int id, String name){
		super(id, name);
	}
}