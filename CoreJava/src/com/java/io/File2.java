package com.java.io;

import java.io.File;

public class File2 {

	public static void main(String[] args) {

		File file= new File("C:/Users/Dell/workspace/CoreJava");
		if(file.exists()){
			for(String s: file.list()){
				File file1= new File("C:/Users/Dell/workspace/CoreJava", s);
				if(file1.isFile())
				System.out.println(s);
			}
		}
		
	}

}
