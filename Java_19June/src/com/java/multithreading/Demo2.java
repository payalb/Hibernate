package com.java.multithreading;

public class Demo2 {

	
	public static void main(String[] args) throws InterruptedException {
		long startTime= System.currentTimeMillis();
		Task1 task1= new Task1();
		Thread t1= new Thread(task1);
		
		Task2 task2= new Task2();
		Thread t2= new Thread(task1);
		
		t1.start();
		t1.start();
		t2.start();
		System.out.println("done!");
		Thread.sleep(2000);
		long endTime= System.currentTimeMillis();
		System.out.println("done in : "+ (endTime-startTime)+  " time");
	}
	public static void printNumbers101To200() {
		int sum=0;
		for(int i= 101; i<20000; i++){
			sum= sum+i;
			
		}
		System.out.println("Sum of no's from 101 to 200 is: "+ sum);
	}

	public static void printNumbers1To100() {
		int sum=0;
		for(int i= 0; i<10000; i++){
			sum= sum+i;
		}
		System.out.println("Sum of no's from 1 to 100 is: "+ sum);
	}


}


class Task1 implements Runnable{

	@Override
	public void run() {
		Demo2.printNumbers1To100();
	}
	
}

class Task2 implements Runnable{

	@Override
	public void run() {
		Demo2.printNumbers101To200();
	}
	
}