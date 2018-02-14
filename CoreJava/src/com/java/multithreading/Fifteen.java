package com.java.multithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//CountdownLatch
public class Fifteen {

	public static void main(String[] args) throws InterruptedException {
		//main thread waits till latch 0
		CountDownLatch latch= new CountDownLatch(5);
		ExecutorService service= Executors.newFixedThreadPool(2);
		for(int i=0; i<5; i++)
		service.submit(new Task1(latch));
		//waits until latch count is 0
		latch.await();
		System.out.println("Main thread terminating now..");
	}
}

class Task1 implements Runnable{

	private CountDownLatch latch;
	
	Task1(CountDownLatch latch){
		this.latch= latch;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(i);
		}
		latch.countDown();
	}
}