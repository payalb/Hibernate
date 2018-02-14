package com.java.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CmdLineArg {

	public static void main(String[] args) {
		
		/*String str= "&All;Bell!Tell-";*/
		
		//split it on the basis of special characters
		Pattern pattern = Pattern.compile("l{2}");
		Matcher matcher= pattern.matcher("all;1Bell3!Tell-");
		while(matcher.find()){
			System.out.println(matcher.start());
		
		}
		
		System.out.println("End!!");
		
		
		
		
		
		
		
	/*	String str= "All;bell;Tell";
		System.out.println(str.contains("lli"));
		
		// o -> a
		str= str.replace("ll", "pp");
		System.out.println(str);
		
		String[] arr= str.split(";");
		for(String var1: arr){
			System.out.println(var1);
		}*/
	}

}

 
//1) You can have more than 1 class in a file but cannot have more than 
 //1 public class in a file
//2) If a file has a public class, name of the file should be same as the 
//class name.