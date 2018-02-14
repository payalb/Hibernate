package com.java.multithreading;

//Synchronization method using thread class objects. Object not shared. Different heap space.
//Object lock does not work. Class lock works.
public class Eleven extends Thread {

	public static void main(String[] args) throws InterruptedException {
		Eleven obj1 = new Eleven();
		Eleven obj2 = new Eleven();
		obj1.start();
		obj2.start();
	}

	public  void run() {
		task();
	}

	private void task() {
		synchronized(Eleven.class){
		for (int i = 0; i < 1000; i++)
			System.out.println(this.getName()+" - " + i);
		}
	}

	
}
