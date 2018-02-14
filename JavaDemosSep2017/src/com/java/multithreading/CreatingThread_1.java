package com.java.multithreading;

import java.util.Scanner;

public class CreatingThread_1 {

	public static void main(String[] args) {

		//2 independent tasks running in parallel
		Task1 task1= new Task1();
		Task2 task2= new Task2();
		task1.start();
		task2.start();
	}

}
//Create thread by extending Thread class
//This task can be done while other thread is waiting for the user input.
class Task1 extends Thread{
	
	@Override
	public void run(){
		for(int count=0; count<=10; count++){
			System.out.println(count);
		}
	}
	
}


class Task2 extends Thread{
	
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