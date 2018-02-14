package com.java;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		Properties prop= System.getProperties();
		Set set=prop.entrySet();
		Iterator iterator= set.iterator();
		while(iterator.hasNext()){
			Entry entry= (Entry) iterator.next();
			System.out.print(entry.getKey() +" : ");
			System.out.println(entry.getValue());
		}
	}

}
