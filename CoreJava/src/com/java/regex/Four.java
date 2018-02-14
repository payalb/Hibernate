package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Four {

	public static void main(String[] args) {
		//Pattern p = Pattern.compile("\\s");
		//Pattern p =Pattern.compile("o");
		//Except o, remaining are tokens
	//	Pattern p = Pattern.compile("\\.");
		Pattern p = Pattern.compile("[.]");
		//Treat . as a symbol, not as meaning.
		
		String[] sArray= p.split("Hello. World !");
		//Split will split the target string based on particular pattern
		for(String s: sArray){
			System.out.println(s);
		}

	}

}
