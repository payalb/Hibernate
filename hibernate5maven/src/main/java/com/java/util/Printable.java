package com.java.util;

import java.util.Arrays;
import java.util.List;

class A{
	
	
	public static void main(String args[]) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,5,67);
		System.out.println(list.stream().
				filter( t-> t%2==0).
				mapToInt(i-> i*i).
				sum());
			
	}
}
