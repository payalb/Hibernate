package com.java.lambda;

public class FunctionalInterface_7 {

	public static void main(String[] args) {
		MyInterface7 obj= new MyInterface7(){
			@Override
			public int add(int a, int b) {
				System.out.println(a+b);
				return (a+b);
			}
		};
		obj.add(4,5);
		
		MyInterface7 obj1= (int a, int b)->{System.out.println(a+b); return  (a+b);};
		obj1.add(54,34);
		obj1.mul(2, 3);
		MyInterface7.sub(4, 2);
		
	//	If more than 1 statement, cannot ignore curly bracket and return statement
		/*MyInterface7 obj2= (a,b)-> {System.out.println(a+b);return a+b;};
		obj2.add(54,34);*/
	}

}
//Can have any number of static or default methods
@FunctionalInterface
interface MyInterface7{
	int add(int a, int b);
	static void sub(int a, int b){
		System.out.println(a-b);
	}
	default void mul(int a, int b){
		System.out.println(a*b);
	}
}
