package com.java.lambda;

public class FunctionalInterface_5 {

	public static void main(String[] args) {
		MyInterface5 obj= new MyInterface5(){
			@Override
			public int add() {
				return 30+20;
			}
		};
		obj.add();
		
		
		MyInterface5 obj1= ()->{return 30+20;};
		System.out.println(obj1.add());
		//return can be written directly
		MyInterface5 obj2= ()->30+20;
		System.out.println(obj2.add());
	}

}

@FunctionalInterface
interface MyInterface5{
	int add();
	
}
