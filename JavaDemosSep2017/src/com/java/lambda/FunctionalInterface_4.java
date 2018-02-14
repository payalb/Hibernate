package com.java.lambda;

public class FunctionalInterface_4 {

	public static void main(String[] args) {
		MyInterface4 obj= new MyInterface4(){
			int x=20;
			@Override
			public void add(int a) {
				System.out.println(a+x);
			}
		};
		obj.add(4);
		
		MyInterface4 obj1= (int a)-> System.out.println("Result after Adding"+ (a+20));
		obj1.add(54);
		obj1.mul(2, 3);
		MyInterface2.sub(4, 2);
		//When only 1 parameter, can remove brackets
		MyInterface4 obj2=  a-> System.out.println("Result after Adding"+ (a+20));
		obj2.add(54);
	}

}
//Can have any number of static or default methods
@FunctionalInterface
interface MyInterface4{
	void add(int a);
	static void sub(int a, int b){
		System.out.println(a-b);
	}
	default void mul(int a, int b){
		System.out.println(a*b);
	}
}
