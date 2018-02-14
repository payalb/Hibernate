package com.java.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream str= new FileOutputStream("E:/abc.txt");
		String string1= "Hello1";
		str.write(string1.getBytes());
		str.close();
	}

}
