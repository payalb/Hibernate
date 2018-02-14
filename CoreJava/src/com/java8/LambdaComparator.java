package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class LambdaComparator {

	public static void main(String[] args) {
		//When only the return statement, no need to write return.
		TreeSet<People> set= new TreeSet<>((p1,p2)->
			 p1.getEmailId().compareTo(p2.getEmailId())
		);
		
		People person1= new People("Ashok",52, "zjshdsg@lkjdf.com");
		People person2= new People("Ashok",50, "fghfhfg@lkjdf.com");
		People person3= new People("Kiran",53, "yuytuy@lkjdf.com");
		People person4= new People("Pooja",52, "vbcvbcg@lkjdf.com");
		
		set.add(person1);
		set.add(person2);
		set.add(person3);
		set.add(person4);
		
		System.out.println(set);
		
		//Sort List
		
		List<People> list= new ArrayList<>();
		list.add(person1);
		list.add(person2);
		list.add(person3);
		list.add(person4);
		
		list.stream().collect(Collectors.groupingBy(People::getAge)).forEach((x,y)->System.out.println(y));
	/*	Collections.sort(list, (p1, p2)-> p1.getEmailId().compareTo(p2.getEmailId()));
		System.out.println(list);
		list.add(new People("dsfdsf",44, "sdfsdf@sjdhfj.com"));
		System.out.println(list);
		//Just reverse the elements in opp. order
		Collections.reverse(list);
		System.out.println(list);
		
		People[] arr= {person1, person2, person3, person4};
		Arrays.sort(arr,  (p1, p2)-> p1.getEmailId().compareTo(p2.getEmailId()));
		for(People p:arr)
		System.out.println(p);
		//Require comparable interface
		//Arrays.sort(arr);
		
		*/
	}

}

class People {

	String name;
	int age;
	String emailId;

	public People(String name, int age, String emailId) {
		this.name= name;
		this.age= age;
		this.emailId= emailId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", emailId=" + emailId
				+ "]";
	}
}

