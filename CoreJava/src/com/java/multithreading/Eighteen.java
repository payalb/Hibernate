package com.java.multithreading;

import java.util.LinkedList;

public class Eighteen {
	LinkedList<Integer> list = new LinkedList<>();
	final int LIMIT = 10;
	int value = 0;

	public static void main(String[] args) throws InterruptedException {

		Eighteen obj = new Eighteen();
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

	// If this thread starts executing first, nosuchelement exception as trying
	// to remove from empty list
	protected void consume() throws InterruptedException {
		
		while (true) {
			synchronized(this){
			if (list.size() == 0) 
				wait();
				System.out.println("Before removing... " + list.size());
				list.removeFirst();
				notify();
				System.out.println("After removing... " + list.size());
			}
		}
	}

	protected void produce() throws InterruptedException {
		while (true) {
			synchronized(this){
			if (list.size() == LIMIT)
				wait();
				System.out.println("Adding number "+ list.size());
				list.add(value++);
				notify();
				System.out.println("After Adding number "+ list.size());
			}
		}
	}

}
