package com.java.lambda;

public class FunctionalInterface_1 {

	public static void main(String[] args) {
		MyInterface1 obj= new MyInterface1(){
			@Override
			public void add() {
				System.out.println("Adding");
			}
		};
		obj.add();
		
		MyInterface1 obj1= ()-> System.out.println("Adding");
		obj1.add();
	}

}

@FunctionalInterface
interface MyInterface1{
	void add();
	
}
