package com.java.multithreading;

class One extends Thread{
	
	@Override
	public void run(){
		System.out.println("Running!!");
	}
	public static void main(String args[]){
		One obj= new One();
		obj.start();
		
	}
	
}

