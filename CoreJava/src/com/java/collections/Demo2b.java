package com.java.collections;

import java.util.Set;
import java.util.TreeSet;

public class Demo2b {

	public static void main(String[] args) {
		Set set= new TreeSet();
		set.add(1);
		set.add(99);
		set.add(34);
		set.add(66);
		set.add(1);
		System.out.println(set.size());
		System.out.println(set);
	}

}
