package com.java.stream;


public class Lambda2 {

	public static void main(String args[]) {
		/*
		 * Map<String, List<String>> myMap= new HashMap<>(); myMap.put("xyz",
		 * Arrays.asList("ahd","dfd","fdfdsf")); myMap.put("pqr",
		 * Arrays.asList("dfds","fdsd","dsfdfs")); myMap.put("tmp",
		 * Arrays.asList("dfds","dsfdfs","dfd")); myMap.put("dfd",
		 * Arrays.asList("dfds","dsfdfs","fdfdsf")); myMap.put("err",
		 * Arrays.asList("dfds","fdsd","dfd")); myMap.put("grr",
		 * Arrays.asList("dfds","dsfdfs","dfd"));
		 */

		// myMap.

		MyClass obj = new MyClass();
		obj.print();
		Printable1 obj1 = new MyClass();
		obj1.printHello();
		obj1.print();
	//	obj.printName("Payal");
		Printable1.printName("Payal");
	}
}

interface Printable1 {
	default public void print() {
		System.out.println("Hello World1");
	}
	static public void printName(String name) {
		System.out.println(name + "1");
	}
	public void printHello();
}

interface Printable2 {
	default public void print() {
		System.out.println("Hello World2");
	}
	static public void printName(String name) {
		System.out.println(name + "2");
	}
	public void printHello();
}

class MyClass implements Printable1, Printable2 {
	@Override
	public void print() {
		Printable1.super.print();
		Printable2.super.print();
	}
	@Override
	public void printHello() {
		System.out.println("Hello");
	}

}