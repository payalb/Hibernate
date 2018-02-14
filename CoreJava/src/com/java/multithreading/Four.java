package com.java.multithreading;

import java.util.Scanner;

//Sharing object heap by threads: volatile prevents caching variable values in thread stack.
public class Four {

	 volatile boolean isActive = true;

	public static void main(String args[]) {
		Four obj = new Four();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				while (obj.isActive) {
					System.out.println("Am active!!");
				}
			}

		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Scanner scanner = new Scanner(System.in);
				scanner.nextInt();
				obj.isActive = false;
			}

		});
		
		t2.start();
	}

}