package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//Thread synchronization

public class Three {

	public static void main(String[] args) {
		//traverseArraysAsListUsingIterator();
		//traverseListUsingIterator();
		//traverseArraysAsListUsingListIterator();
		//traverseListUsingListIterator();
		checkSetMethodListIterator();
	}

	private static void checkSetMethodListIterator() {
		List<String> list = new ArrayList<>();
		list.add("fgdfg");
		list.add("dfdgfd");
		ListIterator<String> it = list.listIterator();
		//it.next();
		if(it.hasPrevious())
		System.out.println(it.previous());
		it.set("sddds");
		System.out.println(list);
	}

	private static void traverseListUsingListIterator() {

		List<String> list = new ArrayList<>();
		list.add("fgdfg");
		list.add("dfdgfd");
		list.add("dfgdfd");
		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
		it.add("sdfsdfd");
		if(it.hasPrevious())
		System.out.println(it.previous());
		System.out.println("Going to add element at index:"+ it.nextIndex());
		it.add("fdgfdgf");
		System.out.println("Element added at index: "+it.previousIndex());
		if(it.hasPrevious())
			System.out.println(it.previous());
		it.set("sddds");
		System.out.println(list);
	}

	private static void traverseArraysAsListUsingListIterator() {
		List<String> list = Arrays.asList("fgdfg", "dfdgfd", "dfgdfd");
		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
			it.add("sdfsdfd");
			System.out.println(it.previous());
			
		}
		System.out.println(list);
	}

	private static void traverseArraysAsListUsingIterator() {
		List<String> list = Arrays.asList("fgdfg", "dfdgfd", "dfgdfd");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
		System.out.println(list);
	}
	
	private static void traverseListUsingIterator() {
		List<String> list = new ArrayList<>();
		list.add("fgdfg");
		list.add("dfdgfd");
		list.add("dfgdfd");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
		System.out.println(list);
	}
}
