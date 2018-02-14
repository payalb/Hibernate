package com.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		Properties prop= new Properties();
		FileReader reader= new FileReader("User.properties");
		prop.load(reader);
		String username= prop.getProperty("username");
		String password= prop.getProperty("password");
		System.out.println(username);
		System.out.println(password);
	}

}
