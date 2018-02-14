package com.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class Demo2c {

	public static void main(String[] args) {
		Set<Object> set= new TreeSet<Object>();
		set.add(1);
		set.add(34.5f);
		set.add("66");
		set.add(1);
		System.out.println(set.size());
	}

}
