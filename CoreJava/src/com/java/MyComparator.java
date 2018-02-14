package com.java;

import java.util.Comparator;

import com.java.entity.Person3;

public class MyComparator implements Comparator<Person3>{
	@Override
	public int compare(Person3 o1, Person3 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
}