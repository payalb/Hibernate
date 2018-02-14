package com.java;

public class FinalizeExample {

	public static void main(String[] args) {
		// finalize is method present in object class, called before Garbage collection. 
		
		objectDestroyed();
		for(int i=0; i<100000; i++){
			System.out.println(i);
		}
	}

	private static void objectDestroyed() {
		FinalizeExample obj= new FinalizeExample();
	}

	@Override
	public void finalize(){
		System.out.println("Object getting deleted!!");
	}
}
