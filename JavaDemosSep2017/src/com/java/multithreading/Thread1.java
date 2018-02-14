package com.java.multithreading;


public class Thread1 {

	public static void main(String[] args) throws InterruptedException {
		Task_1 thread1 = new Task_1();
		thread1.start();
		System.out.println(thread1.isAlive());
		
		Thread.sleep(5000);
		System.out.println(thread1.isAlive());
	}

}

class Task_1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("2 * " + i + " = " + (2 * i));
	}
}

/*class Task_2 extends Thread {
	@Override
	public void run() {
		
	}
}
*/