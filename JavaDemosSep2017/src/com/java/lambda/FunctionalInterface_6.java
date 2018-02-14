package com.java.lambda;

public class FunctionalInterface_6 {

	public static void main(String[] args) {
		MyInterface6 obj= new MyInterface6(){
			@Override
			public int add(int a, int b) {
				return (a+b);
			}
		};
		obj.add(4,5);
		
		MyInterface6 obj1= (int a, int b)->{ return  (a+b);};
		obj1.add(54,34);
		obj1.mul(2, 3);
		MyInterface2.sub(4, 2);
		
		MyInterface6 obj2= (a,b)-> a+b;
		obj2.add(54,34);
	}

}
//Can have any number of static or default methods
@FunctionalInterface
interface MyInterface6{
	int add(int a, int b);
	static void sub(int a, int b){
		System.out.println(a-b);
	}
	default void mul(int a, int b){
		System.out.println(a*b);
	}
}
