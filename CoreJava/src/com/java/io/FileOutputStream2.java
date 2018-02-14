package com.java.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream2 {

	public static void main(String[] args) throws IOException {
		FileOutputStream str= new FileOutputStream("E:/abc.txt", true);
		String string1= "Hello";
		
		for(char c:string1.toCharArray()){
			str.write(c);
		}
		str.close();
	}

}
