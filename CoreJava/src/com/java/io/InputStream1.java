package com.java.io;

import java.io.IOException;

public class InputStream1 {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter your name:");
		char c= (char) System.in.read();
		String s="";
		while(c != '\n'){
			 s= s+c;
			 c= (char) System.in.read();
		}
		
		System.out.write(s.getBytes());
		for(int i=0; i<s.length(); i++){
			System.out.println(s.charAt(i));
		}
	}

}
