package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class Demo1b {

	public static void main(String[] args) {
		List list= new ArrayList();
		list.add(1);
		list.add("hhd");
		list.add(54.3f);
		list.add(1);
		System.out.println(list.size());
		System.out.println(list.contains(1));
		System.out.println(list.contains("hhd"));
		
	}

}

