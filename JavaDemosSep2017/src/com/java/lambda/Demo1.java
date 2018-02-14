package com.java.lambda;

public class Demo1 {
	public static void main(String[] args) {
		
		//Lambda expressions will only work for functional inetrfaces
	Thread t1= new Thread(() ->{	System.out.println("Running");}	);
	t1.start();
	
	//If only one statement in the method body, can remove curly brackets and a semicolon
	Thread t2= new Thread(() ->System.out.println("Running")	);
	t2.start();
	
	
	
	}
}

@FunctionalInterface
interface M1{
	public int findLength(String s) ;
}

class X  {
	public static void main(String args[]){
	M1 obj= new M1(){

		@Override
		public int findLength(String s) {
			return s.length();
			
		}};
		
		M1 obj1= (String s) ->{
				return s.length();
				
			};
			
			M1 obj2= s ->	 s.length();
		System.out.println(obj2.findLength("Hello World!"));
		
		
		
	}
	
}