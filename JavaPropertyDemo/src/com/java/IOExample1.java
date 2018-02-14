package com.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOExample1 {

	public static void main(String[] args) throws IOException {
	Employee emp= new Employee();
	BufferedReader fos= new BufferedReader(new FileReader("abc.txt"));
	String s=fos.readLine();
	String[] arr=s.split(",");
	emp.setId(Integer.parseInt(arr[0]));
	System.out.println(emp.getId());
	fos.close();
	}

}
