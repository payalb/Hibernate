package com.java.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TwentyFive {

	public static void main(String[] args) throws InterruptedException {
		CountDownLatch latch= new CountDownLatch(5);
		ExecutorService pool= Executors.newCachedThreadPool();
		for(int i=0; i<5; i++)
		pool.submit(new MyTask2(i, latch));
		latch.await();
		System.out.println("Main thread terminating..");
		
	}

}


class MyTask2 implements Runnable{
	CountDownLatch latch;
	int id;

	MyTask2(int id, CountDownLatch latch){
		this.id= id;
		this.latch= latch;
	}
	@Override
	public void run() {
		System.out.println("Started.. "+ id);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Terminating.. "+ id);
		latch.countDown();
		
	}
	
}