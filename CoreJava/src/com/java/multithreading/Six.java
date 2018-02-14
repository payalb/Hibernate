package com.java.multithreading;

//Why we need synchronization. Always will return 2000 as the answer
public class Six {

	int count = 0;

	public static void main(String[] args) throws InterruptedException {
		Six obj= new Six();
		obj.startThreads();
		
	}
	
	public synchronized void incrementCount(){
		count++;
	}

	public void startThreads() throws InterruptedException{
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++)
					incrementCount();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++)
					incrementCount();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(count);
	}

}
