package com.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedIOExample {
	// Uses internal buffer to store data, hence make i/o operations faster.
	//Buffered i/p stream reads data from the buffer only when it is vacant and 
	//buffered o/p stream writes data to buffer only when it is full. We may have the need 
	//to write out a buffer before it is full, so we do flush.
	//Autoflush when set to true in arg, will flush the buffer content at trigger points
	// like Printwriter.println, format
	// Read complete line and PrintWriter.println is used
	// to write complete line.

	public static void main(String[] args) throws IOException {
		try (BufferedReader str = new BufferedReader(new FileReader("src/abc"));
				PrintWriter writer = new PrintWriter(new FileWriter(new File(
						"src/copy")));) {
			String data = str.readLine();
			while (data != null) {
				writer.println(data);
				data = str.readLine();
			}
			writer.flush();
		}
	}

}
