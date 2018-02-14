package com.java.multithreading;

//Synchronization method using thread class objects. Object not shared. Diff. heap space.
public class Seven extends Thread{

	int count = 0;

	public static void main(String[] args) throws InterruptedException {
		Seven obj1= new Seven();
		Seven obj2= new Seven();
		obj1.startThread1();
		obj2.startThread2();
		System.out.println(obj2.count);
		System.out.println(obj1.count);
	}
	
	public synchronized void incrementCount(){
		count++;
	}

	public void startThread1() throws InterruptedException{
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++)
					incrementCount();
			}
		});
		t1.start();
		t1.join();
	}
	public void startThread2() throws InterruptedException{
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++)
					incrementCount();
			}
		});
		
		t2.start();
		t2.join();
		
	}

}
