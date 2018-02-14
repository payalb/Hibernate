package com.java.multithreading;

//Synchronization method using thread class objects. Object shared. Shared heap space.
//Object lock does works here. Acquires intrinsic lock. 
//1 thread completes execution, then other begins
public class Nine implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		Nine obj = new Nine();
		Thread t1= new Thread(obj);
		Thread t2= new Thread(obj);
		t1.start();
		t2.start();
	}

	public void run() {
		task();
	}

	private synchronized void task() {
		for (int i = 0; i < 1000; i++)
			System.out.println(i);
	}

	
}
