package com.java;

import java.util.HashMap;
 class SuperClass {
	 public int doIt(String str, Integer... data) throws Exception {
	  String signature = "(String, Integer[])";
	  System.out.println(str + " " + signature);
	  return 1;
	 }
	}

public	 class Java_Var1 extends SuperClass {
	 public int doIt(String str, Integer... data) {
	  String signature = "(String, Integer[])";
	  System.out.println("Overridden: " + str + " " + signature);
	  return 0;
	 }

	 public static void main(String... args) throws Exception {
	  SuperClass sb = new Java_Var1();
	  sb.doIt("hello", 3);
	  


	  /*  SortedSet<Integer> set = new TreeSet<Integer>();
	    set.add(7);
	    set.add(-12);
	    SortedSet<Integer> sub = set.subSet(-100, 100);
	    sub.add(9);
	    System.out.format("%d %d", set.size(), sub.size());
	    */

	   /* SortedSet<Integer> set = new TreeSet<Integer>();
	    set.add(7);
	    set.add(-12);
	    SortedSet<Integer> sub = set.subSet(-100, 100);
	    sub.add(-100);
	    //sub.add(100);
	    //sub.add(200);
	    set.add(200);
	    set.add(93);
	    
	    System.out.format("%d %d", set.size(), sub.size());
	*/
	   /* SortedSet set = new TreeSet();
	    set.add(7);
	    set.add(-12);
	    SortedSet sub = set.headSet(-15);
	    System.out.format("%d %d", set.size(), sub.size());*/
	//  The lower() method returns the greatest element that is less than the specified element. 

	  //The floor() method returns the greatest element in the NavigableSet that is less than or equal to the specified element. 

	  //The higher() method returns the least element in the NavigableSet that is greater than the specified element. 

	  //The ceiling() method returns the least element in the NavigableSet that is greater than or equal to a specified element. 
/*
	  HashSet set = new HashSet();
	    set.add(1);
	   // set.add(1);
	    set.add(5);
	    set.add(0);
	    set.add(null);
	    set.add(19);
	    set.add(19);
	    set.add(null);
	    System.out.println(set);*/
	    /*System.out.println(set.ceiling(4));
	    System.out.println(set.floor(4));
	    System.out.println(set.lower(4));
	    System.out.println(set.higher(4));*/
	  HashMap map= new HashMap();
	  Person1 p= new Person1("a");
	  map.put(p, "1");
	  Person1 p1= new Person1("b");
	  map.put(p1,"2");

	  System.out.println(map.get(p));
	  p.setName("c");
	  System.out.println(map.get(p));
	 }
	}
 


class Person1{

String name;

public String getName() {
	return name;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	//result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Person1 other = (Person1) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

public void setName(String name) {
	this.name = name;
}

Person1(String name){
this.name= name;
}
}




