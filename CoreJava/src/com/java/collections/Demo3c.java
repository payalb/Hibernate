package com.java.collections;

import java.util.Map;
import java.util.TreeMap;

public class Demo3c {

	public static void main(String[] args) {
		Map map= new TreeMap();
		map.put(1, "Megha");
		map.put(23, "Kirti");
		map.put(1, "Sneha");
		map.put("fd", "sdfds");
		System.out.println(map.size());

	}

}
