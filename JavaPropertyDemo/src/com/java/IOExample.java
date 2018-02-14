package com.java;

import java.io.IOException;
import java.io.PrintWriter;

public class IOExample {

	public static void main(String[] args) throws IOException {
	Employee emp= new Employee(1, "Payal");
	PrintWriter fos= new PrintWriter("abc.txt");
	fos.println(emp);
	fos.close();
	}

}
