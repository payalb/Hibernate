package com.java;

 class FinalVariable {
	 
	 static final private int iCounter=5;
	 
	 //OR
	 
	 /*
	  static{
		 iCounter=4;
	 }
	*/
	 
	 //For static variables initializing in instance block or constructor won't work
	/* FinalVariable()
	 {
		 iCounter=4;
	 }*/
	 
	 final private int count=5;
	 
	 //OR
	 
	 /*
	   final private int count; 
	 {
		 count=5;
	 }
	*/ 
	 
	 //OR
	 
	/* 
	 FinalVariable(){
		 count=5;
	 }
	 */
	 
	public static void main(String[] args) {
		//Final variables, once assigned value cannot be changed. Value must be assigned before use.
		//In-case an instance variable is final, value must be assigned before instance is created.
		//Final local variables must be assigned value before using them.
		//Final class variables should be assigned value before class instance is first created.
		
		final int counter;
		System.out.println(counter=5);
		
		
		//Final methods cannot be overridden. Final class cannot be extended.
	}
	
	final Object add(){
		return null;
	}

}
 
 class Parent extends FinalVariable{
	 
//	 Cannot override add method. Overriding means same method signature. Return type can be covariant
	
	 /* @Override
	 String  add(){
		 return null;
		}*/
 }
