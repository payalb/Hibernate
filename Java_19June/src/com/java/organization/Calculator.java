package com.java.organization;

class A{
	public static void method(int i){
		System.out.print("Method 1");
	}

	public static int method(String str){
		System.out.print("Method 2");
		return 0;
	}
}

 class Test{
     
	public static void main(String args[]){
		A.method(5);
	}
}