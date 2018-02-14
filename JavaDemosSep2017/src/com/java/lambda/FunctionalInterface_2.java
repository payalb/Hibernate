package com.java.lambda;

public class FunctionalInterface_2 {

	public static void main(String[] args) {
		MyInterface2 obj= new MyInterface2(){
			@Override
			public void add() {
				System.out.println("Adding");
			}
		};
		obj.add();
		
		MyInterface2 obj1= ()-> System.out.println("Adding");
		obj1.add();
		obj1.mul(2, 3);
		MyInterface2.sub(4, 2);
	}

}
//Can have any number of static or default methods
@FunctionalInterface
interface MyInterface2{
	void add();
	static void sub(int a, int b){
		System.out.println(a-b);
	}
	default void mul(int a, int b){
		System.out.println(a*b);
	}
}
