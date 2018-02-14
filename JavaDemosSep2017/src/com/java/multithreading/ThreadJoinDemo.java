package com.java.multithreading;

import com.java.multithreading.runnable.MyRunnable;

public class ThreadJoinDemo {

	public static void main(String[] args) {
	Thread thread1 = new Thread(new MyRunnable(), "First");
        Thread thread2 = new Thread(new MyRunnable(), "Second");
        Thread thread3 = new Thread(new MyRunnable(), "Third");
        thread1.start();
        try {
            thread1.join(10000);
        } catch (InterruptedException exp) {
           System.err.println(exp.getMessage());
        }
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException exp) {
            System.err.println(exp.getMessage());
        }
         
        thread3.start();
         
        //let all threads finish execution before finishing main thread
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException exp) {
            System.err.println(exp.getMessage());
        }
         
        System.out.println("All threads are dead, exiting main thread");
	
	
	
	}

}
