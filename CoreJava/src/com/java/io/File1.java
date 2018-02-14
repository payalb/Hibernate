package com.java.io;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {
		File file1= new File("abc.txt");
		//No new file created if does not exist, just a file object created. If exist, we'll get a pointer to it.
		if(file1.exists()){
			System.out.println("File exists!");
		}else{
			System.out.println("File does not exist, going to create one!");
			file1.createNewFile();
			System.out.println(file1.exists());
		}
		file1.deleteOnExit();
		File file2= new File("abc");
		if(file2.exists()){
			System.out.println("Directory exists!");
		}else{
			System.out.println("Directory does not exist, going to create one!");
			file2.mkdir();
			System.out.println(file2.exists());
		}
		file2.delete();
	}

}
