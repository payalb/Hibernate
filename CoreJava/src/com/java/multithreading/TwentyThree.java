package com.java.multithreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwentyThree {

	private String number1;
	private String number2;
	private Object lock= new Object();

	public static void main(String[] args) {
		TwentyThree obj = new TwentyThree();
		Thread ALUThread = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (obj.lock) {
					if (obj.number1 == null || obj.number1.isEmpty()
							|| obj.number2 == null || obj.number2.isEmpty()) {
						try {
							obj.lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					int result= obj.add();
					System.out.println(result);
				}
			}

		});
		Thread IOThread = new Thread(new Runnable() {

			@Override
			public void run() {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(System.in));
				System.out.println("enter two nos:");
				synchronized (obj.lock) {
					try {
						obj.number1 = reader.readLine();
						obj.number2 = reader.readLine();
						obj.lock.notify();
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		ALUThread.start();
		IOThread.start();
	}

	public int add() {
		return (Integer.parseInt(number1) + Integer.parseInt(number2));
	}

	
}
