package com.java.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {
		Map map= new HashMap();
		map.put(1, "Megha");
		map.put(23, "Kirti");
		map.put(1, "Sneha");
		map.put(null, "abc");
		map.put(null, "def");
		map.put("fd", "sdfds");
		System.out.println(map.size());
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		Set es= map.entrySet();
		Iterator it= es.iterator();
		while(it.hasNext()){
			Entry entry = (Entry) it.next();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
