package com.java.multithreading;

public class TwentyOne {

	public void printNumber() {
		for (int i = 0; i < 100; i++)
			System.out.println(i);
	}

	public synchronized void printString() {
		for (int i = 0; i < 100; i++)
			System.out.println("Hi");
	}

	public static void main(String args[]) {
		TwentyOne obj = new TwentyOne();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				obj.printNumber();
				obj.printString();

			}

		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				obj.printString();
				obj.printNumber();
			}

		});
		t1.start();
		t2.start();
	}

}
