package com.java.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Fourteen {

	public static void main(String[] args) throws InterruptedException {
		//Start one task after finishing other task.
		ExecutorService service= Executors.newFixedThreadPool(2);
		for(int i=0;i<5;i++){
			service.submit(new Task(i));
		}
		//Given 5 tasks to 2 threads. So at a time only 2 threads are alive.
		service.shutdown();
		//Will shutdown only after tasks are complete.
		service.awaitTermination(5, TimeUnit.MINUTES);
		//automatically terminate after 5 mins even if task was not complete.
		System.out.println("Done!!");
	}

}

class Task implements Runnable{
	int id;

	Task(int id){
		this.id= id;
	}
	@Override
	public void run() {
		System.out.println(id+ " running.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(id +" completed.");
	}
	
}