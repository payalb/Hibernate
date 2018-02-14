package com.java.multithreading;

import java.util.Scanner;

public class SingleThreadedApp {

	public static void main(String[] args) {
//Task 1
		try(Scanner sc= new Scanner(System.in);){
		System.out.println("Enter your name:");
		String name= sc.nextLine();
		//Thread waiting for user input. Once user enters, then only prints the name and count.
		System.out.println(name);
		}
//Task 2	
		for(int count=0; count<=10; count++){
			System.out.println(count);
		}
	}

}

