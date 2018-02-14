package com.java.io;


 class MyClass {
	
	private static int x ;
	private final int y;
	
	{
		y = 4;
	}
	public static void main(String[] args) {
		MyClass obj= new MyClass();
		System.out.println(x);
		System.out.println(obj.y);
	}

}
 