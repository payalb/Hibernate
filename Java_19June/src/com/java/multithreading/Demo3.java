package com.java.multithreading;

public class Demo3 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		long startTime= System.currentTimeMillis();
		Thread.sleep(2000);
		Demo3 thread1= new Demo3();
		thread1.start();
		Demo3 thread2= new Demo3();
		thread2.start();
		thread1.join();
		thread2.join();
		long endTime= System.currentTimeMillis();
		System.out.println("done in : "+ (endTime-startTime)+  " time");
	}
	@Override
	public void run() {
		printNumbers1To100();
	}

	private static void printNumbers1To100() {
		int sum=0;
		for(int i= 0; i<=2000; i++){
			sum= sum+i;
		}
		System.out.println("Sum of no's from 1 to 100 is: "+ sum);
	}

}
