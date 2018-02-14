package com.java.multithreading;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		long startTime= System.currentTimeMillis();
		
		Thread t1= new Thread(new Runnable(){

			@Override
			public void run() {
				printNumbers1To100();
			}
			
		});
		
		Thread.sleep(2000);
		Thread t2= new Thread(new Runnable(){

			@Override
			public void run() {
				printNumbers101To200();
			}
			
		});
		t1.start();
		t2.start();
		long endTime= System.currentTimeMillis();
		System.out.println("done in : "+ (endTime-startTime)+  " time");
	}

	private static void printNumbers101To200() {
		int sum=0;
		for(int i= 101; i<20000; i++){
			sum= sum+i;
			
		}
		System.out.println("Sum of no's from 101 to 200 is: "+ sum);
	}

	private static void printNumbers1To100() {
		int sum=0;
		for(int i= 0; i<10000; i++){
			sum= sum+i;
		}
		System.out.println("Sum of no's from 1 to 100 is: "+ sum);
	}

}
