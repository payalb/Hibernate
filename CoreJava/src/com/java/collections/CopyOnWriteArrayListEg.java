package com.java.collections;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListEg {
	public static void main(String[] args) {
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("fgdfg");
		list.add("dfdgfd");
		ListIterator<String> it = list.listIterator();
		while (it.hasNext()) {
			list.remove(it.next());
			list.add("SDFdsf");
		}
		list.set(1, "fdfdf");
		System.out.println(list);
	}
}
