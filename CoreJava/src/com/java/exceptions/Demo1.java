package com.java.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo1 {

	public static void main(String[] args) throws Exception{
		Demo1 obj= new Demo1();
		try{
		obj.readContent();
		}finally{
			System.out.println("1");
		}
	}

	
	public void readContent() throws Exception {
		String str= null;
	
	
			try{
				
				System.out.println(str.length());
	
			}finally{
				System.out.println("In finally");
			}
	//	System.out.println("In normal code!!");
		
	}
}
