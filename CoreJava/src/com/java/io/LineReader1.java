package com.java.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineReader1 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		String s;
		try(FileReader fr = new FileReader("E:/abc.txt");
                LineNumberReader lr = new LineNumberReader(fr);) {
			while((s = lr.readLine()) != null)
				System.out.println(lr.getLineNumber()+" " +s);
		}    
	}

}
