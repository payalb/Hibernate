package com.java.multithreading;

public class Three {

	public static void main(String[] args) {
		
		//Creating thread to run a specific task

		Thread t= new Thread (new Runnable(){

			@Override
			public void run() {
					for(int i=0; i<10; i++){
						System.out.println(i);
					}
			}
			
		});
		t.start();
	}

}
