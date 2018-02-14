package com.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered {

	public static void main(String[] args) throws IOException  {
		BufferedReader reader= new BufferedReader(new FileReader(new File("C:/Users/Dell/workspace/CoreJava/.classpath")));
		BufferedWriter writer= new BufferedWriter(new FileWriter(new File("C:/Users/Dell/workspace/CoreJava/.classpath_copy")));
		String s;
		while(( s= reader.readLine())!= null){
			writer.write(s+"/n");
		}
		reader.close();
		writer.close();
	}

}
