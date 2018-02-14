package com.java.multithreading;

public class Demo5 {
	
	int sum;

	public static void main(String[] args) throws InterruptedException {
		Demo5 obj= new Demo5();
		Thread t1= new Thread(new Tasks1(obj));
		Thread t2= new Thread(new Tasks2(obj));
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(obj.sum);
	}
	
	

}

class Tasks1 implements Runnable{
	
	Demo5 obj;
	
	Tasks1(Demo5 obj){
		this.obj= obj;
	}

	@Override
	public void run() {
		
		for(int i=0; i<=1000; i++){
			obj.sum=obj.sum+i;
		}
	}
	
	
}

class Tasks2 implements Runnable{
Demo5 obj;
	
	Tasks2(Demo5 obj){
		this.obj= obj;
	}
	@Override
	public void run() {
		for(int i=1001; i<=2000; i++)
			obj.sum=obj.sum+i;
	}
	
	
}