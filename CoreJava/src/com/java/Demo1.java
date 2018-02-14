package com.java;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Demo1<E>{

	Stack<E> stack= new Stack();
	public static void main(String[] args) throws ClassNotFoundException {
		Demo1 obj= new Demo1();
		Class c= obj.getClass();
	}
  Set<E> union (Set<? extends E> set1, Set<? extends E> set2){
	  Set<E> set= new HashSet<>();
	  set.addAll(set1);
	  set.addAll(set2);
	return set;
	 
 }
	void pushAll(Collection<? extends E> src){
		stack.addAll(src);
	}
	
	void popAll(Collection<? super E> dest){
		dest.addAll(stack);
	}
	private static List<String> getList() {
		List<String> list= new ArrayList<>();
		list.add("1");
		list.add("sdsahdj");
		return list;
	}

}

