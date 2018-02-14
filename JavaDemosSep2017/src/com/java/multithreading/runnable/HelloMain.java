package com.java.multithreading.runnable;

public class HelloMain {

	public static void main(String[] args) {
		

	    HelloRunnable hello = new HelloRunnable();
		Thread helloThread = new Thread(hello);
	
		helloThread.start();
	
	}

}
