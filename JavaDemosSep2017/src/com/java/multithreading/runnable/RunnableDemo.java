package com.java.multithreading.runnable;

import java.util.Date;

public class RunnableDemo {
	
	
	public static void main(String[] args) {
		

		
		Thread fstThread = new Thread(new MyRunnable());
		
		
		fstThread.start();
		
	
			
			
	
	}

}
