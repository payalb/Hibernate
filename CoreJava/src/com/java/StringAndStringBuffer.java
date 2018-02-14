package com.java;

public class StringAndStringBuffer {

	/*
	 * String object is immutable whereas stringBuffer object is not. If changes
	 * to existing object, for string: new object is created. For stringBuffer:
	 * no new object created
	 */

	public static void main(String[] args) {

		StringBuffer buffer = new StringBuffer("Hello");
		System.out.println(buffer.hashCode());
		buffer.append("World");
		System.out.println(buffer.hashCode());
		System.out.println(buffer);

		String str = new String("Hello");
		System.out.println(str.hashCode());
		str = str.concat("World");
		System.out.println(str.hashCode());
	}

}
