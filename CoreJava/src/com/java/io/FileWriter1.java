package com.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) throws IOException {
		FileWriter writer= new FileWriter("E:/abc.txt");
		String string1= "Hello";
		
			writer.write(string1);
			writer.close();
	}

}
