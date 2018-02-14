package com.java.multithreading;


public class Demo4 {
	
	private int sum=0;
	public static void main(String[] args) throws InterruptedException {
		Object lock= new Object();
		Demo4 obj= new Demo4();
		Thread t1= new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0; i<=1000; i++){
					synchronized(lock){
					obj.sum=obj.sum+i;
					}
				}
			}
		});
		
Thread t2= new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++){
					synchronized(lock){
					obj.sum=obj.sum+i;
					}
				}
			}
		});
t1.start();
t2.start();
t1.join();
t2.join();
System.out.println(obj.sum);
	}

}
