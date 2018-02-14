package com.java.multithreading;

//Why we need synchronization
public class Five {

	int count = 0;

	public static void main(String[] args) throws InterruptedException {
		Five obj= new Five();
		obj.startThreads();
		
	}

	public void startThreads() throws InterruptedException{
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++)
					count++;
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 1000; i++)
					count++;
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(count);
	}

}
