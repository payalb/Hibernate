package com.java.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo2d {

	public static void main(String[] args) {
		Set set= new HashSet();
		set.add(1);
		set.add(34);
		set.add(66);
		set.add(1);
		System.out.println(set.size());
		Iterator it= set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
