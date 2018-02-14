package com.java.collections;

import java.util.HashSet;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Set set= new HashSet();
		Student st= new ArtStudent(2, "cfd");
		Student st1= new ArtStudent(2, "cfd");
		set.add(new ScienceStudent(1, "sfdsf"));
		set.add(st);
		System.out.println(set.size());
		System.out.println(set.contains(st));
	}

}


