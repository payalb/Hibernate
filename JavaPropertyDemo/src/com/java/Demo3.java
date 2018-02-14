package com.java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		Properties prop= new Properties();
		FileWriter writer= new FileWriter("User.properties", true);
		prop.setProperty("url", "jdbc:oracle:thin:@url");
		prop.store(writer, "Added url");
		
		prop.list(System.out);
	}

}
