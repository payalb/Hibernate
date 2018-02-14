package com.java.multithreading;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

//Producer consumer
//ArrayBlockingQueue: can add items to it and can remove from it. FIFO.
//Can add any kind of items to it. Thread safe. Can access from multiple threads.
//At a time only 10 elements in queue.
//ArrayBlockingQueue is a bounded, blocking queue that stores the elements internally in an array.
//That it is bounded means that it cannot store unlimited amounts of elements. There is an upper bound on the number of elements it can store at the same time. You set the upper bound at instantiation time, and after that it cannot be changed. 
//The head of the queue is the element which has been in queue the longest time, and the tail of the queue is the element which has been in the queue the shortest time
public class Sixteen {

	BlockingQueue<Double> q = new ArrayBlockingQueue<>(10);

	public static void main(String[] args) {
		Sixteen obj = new Sixteen();
		obj.startThreads();
	}

	public void startThreads() {
		Thread t1 = new Thread(() -> {
			while (true) {
				try {
					q.put(Math.random());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		Thread t2 = new Thread(() -> {
			while (true) {
				try {
					double value= q.take();
					System.out.println("value removed"+ value +" .Queue size is "+ q.size());
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}
}
