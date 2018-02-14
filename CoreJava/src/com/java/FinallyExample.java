package com.java;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

public class FinallyExample {

	public static void main(String[] args) throws IOException {

		// Finally block is executed whether or not an exception is thrown. If
		// an exception is not caught in the catch block, finally block executes
		// and then throws an exception. So has the cleanup code: close db connection.
		
		//IOException, FileNotFoundException, EOFException are all checked exceptions
		FinallyExample obj= new FinallyExample();
		obj.methodOne();
		System.out.println("2");
	}

	void methodOne() throws IOException{
		try {
			File file = new File("abc.txt");
			throw new EOFException();
		} finally {
			System.out.println("1");
		}
	}
}

/*
output: 1
Exception in thread "main" java.io.IOException
at com.java.FinallyExample.methodOne(FinallyExample.java:21)
at com.java.FinallyExample.main(FinallyExample.java:14)
*/

/*If we comment out line 21, output:  1	 2*/