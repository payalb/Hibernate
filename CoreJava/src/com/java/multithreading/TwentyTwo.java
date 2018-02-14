package com.java.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TwentyTwo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService svc= Executors.newFixedThreadPool(3);
		for(int i=0; i<10; i++){
		Future<Integer> result= svc.submit(new MyTask(i));
		System.out.println(result.get());
		}
		System.out.println("done!!");
	}

}

class MyTask implements Callable<Integer>{
	
	int id;
	
	MyTask(int id){
		this.id= id;
	}
	@Override
	public Integer call() throws Exception {
		System.out.println("Started"+ id);
		Thread.sleep(4000);
		System.out.println("Finished"+ id);
		return id*4+2;
	}
	
}