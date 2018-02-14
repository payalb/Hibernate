package com.java.multithreading;

public class Twenty implements Runnable{
	int count=0;

	public static void main(String[] args) throws InterruptedException {
		Twenty obj= new Twenty();
		Thread t1= new Thread(obj);
		Thread t2= new Thread(obj);
		long startTime= System.currentTimeMillis();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(obj.count);
		long endTime= System.currentTimeMillis();
		System.out.println("Total time taken: "+ (endTime-startTime));
	}

	@Override
	public void run() {
		for(int i=0; i<1000; i++){
			count++;
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
