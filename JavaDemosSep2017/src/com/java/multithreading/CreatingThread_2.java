package com.java.multithreading;

import java.util.Scanner;

public class CreatingThread_2 {

	public static void main(String[] args) {

		//2 independent tasks running in parallel
		Tasks1 task1= new Tasks1();
		Tasks2 task2= new Tasks2();
		//Runnable does not have the start method
		/*task1.start();
		task2.start();*/
		Thread thread1= new Thread(task1);
		Thread thread2= new Thread(task2);
		thread1.start();
		thread2.start();
	}

}
//Create thread by extending Thread class
//This task can be done while other thread is waiting for the user input.
class Tasks1 implements Runnable{
	
	@Override
	public void run(){
		for(int count=0; count<=10; count++){
			System.out.println(count);
		}
	}
	
}


class Tasks2 implements Runnable{
	
	@Override
	public void run(){
		try(Scanner sc= new Scanner(System.in);){
			System.out.println("Enter your name:");
			String name= sc.nextLine();
			//Thread waiting for user input. Once user enters, then only prints the name and count.
			System.out.println(name);
			}
	}
	
}