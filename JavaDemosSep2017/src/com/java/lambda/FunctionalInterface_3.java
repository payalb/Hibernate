package com.java.lambda;

public class FunctionalInterface_3 {

	public static void main(String[] args) {
		MyInterface3 obj= new MyInterface3(){
			@Override
			public void add(int a, int b) {
				System.out.println(a+b);
			}
		};
		obj.add(4,5);
		
		MyInterface3 obj1= (int a, int b)-> System.out.println("Result after Adding"+ (a+b));
		obj1.add(54,34);
		obj1.mul(2, 3);
		MyInterface2.sub(4, 2);
		
		MyInterface3 obj2= ( a,  b)-> System.out.println("Result after Adding"+ (a+b));
		obj2.add(54,34);
	}

}
//Can have any number of static or default methods
@FunctionalInterface
interface MyInterface3{
	void add(int a, int b);
	static void sub(int a, int b){
		System.out.println(a-b);
	}
	default void mul(int a, int b){
		System.out.println(a*b);
	}
}
