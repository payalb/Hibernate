package com.java.multithreading;

public class Runnable_1 {

	public static void main(String[] args) throws InterruptedException {
		//Thread thread1= new Thread(new Tasks_1());
		Tasks_1 task1= new Tasks_1();
		Thread thread= new Thread(task1);
		thread.start();
		thread.join();
		System.out.println(thread.getName());
		
		System.out.println("main thread done!!");
	}
}
	
class Tasks_1 implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<10; i++)
			System.out.println(2*i);
	}
}