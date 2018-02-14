package com.java.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("E:/abc.txt");
		int i = 0;
		String s = "";
		while ((i = reader.read()) != -1) {
			s = s + (char) i;
		}
		System.out.println(s);
		reader.close();
	}

}
