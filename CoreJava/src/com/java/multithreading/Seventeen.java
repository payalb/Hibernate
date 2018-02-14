package com.java.multithreading;

import java.util.Scanner;

//use wait with timeout as param. To prevent endless waiting. called only in synchronized block else IllegalMonitorException.
//Releases control.
public class Seventeen {

	public static void main(String[] args) {

		Seventeen obj = new Seventeen();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					obj.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				try {
					obj.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}

	public void produce() throws InterruptedException {
		synchronized (this) {
			System.out.println("Running Producer...");
			wait();
			System.out.println("Producer resumed...");
		}
	}

	public void consume() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		synchronized (this) {
			System.out.println("Waiting for return key..");
			scanner.nextLine();
			notify();
			scanner.close();
		}
	}

}
