package com.java.multithreading.thread;

import java.time.LocalDateTime;

public class HelloMain {
	public static void main(String[] args) {
		Task_1 task1= new Task_1();
		Thread thread= new Thread(task1);
		thread.start();
	}
}

class Task_1 implements Runnable{
	public void run() {
		while(true){
		System.out.println(LocalDateTime.now());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	
}