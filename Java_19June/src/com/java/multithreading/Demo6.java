package com.java.multithreading;

import java.util.Scanner;

public class Demo6 {
	
	private int sum=0;
	
	public static void main(String args[]){
		Demo6 obj= new Demo6();
		Object lock= new Object();
	Thread t1= new Thread(new Runnable (){

		@Override
		public void run() {
			for(int i=0;i<2000; i++)
				obj.sum= obj.sum+i;
			synchronized(lock){
			lock.notify();
			System.out.println("Will work");
			}
		}
	});
	
	Thread t2= new Thread(new Runnable (){
		@Override
		public void run() {
			try {
				synchronized(lock){
				lock.wait();
				}
			} catch (InterruptedException e) {
			System.out.println("Interrupted!");
			}
			System.out.println(obj.sum);
			}
		
		
	});
	t1.start();
	t2.start();
	}

}
