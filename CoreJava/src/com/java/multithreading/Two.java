package com.java.multithreading;

public class Two {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			XYZ1 obj = new XYZ1(i);
			Thread t = new Thread(obj);
			t.start();
		}
	}

}

class XYZ1 implements Runnable {
	int id;

	public XYZ1(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println("running " + id);
	}
}