package com.java.multithreading;

//Synchronization method using thread class objects. Object not shared. Different heap space.
//Object lock does not work
public class Eight extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Eight obj1 = new Eight();
		Eight obj2 = new Eight();
		obj1.start();
		obj2.start();
	}

	public  void run() {
		task();
	}

	private synchronized void task() {
		for (int i = 0; i < 1000; i++)
			System.out.println(this.getName()+" - " + i);
	}

	
}
