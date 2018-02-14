package com.java.lambda;

public class One {

	public static void main(String[] args) throws InterruptedException {
		Thread t= new Thread(new Runnable(){
			public void run(){
				System.out.println(this.getClass());
				//anonymous class com.java.lambda.One$1 created
			}
		});
		t.start();

		//No anonymous inner-classes using lambda
		Thread t1= new Thread(()->System.out.println("From lambda"));
		t1.start();
	}

}
