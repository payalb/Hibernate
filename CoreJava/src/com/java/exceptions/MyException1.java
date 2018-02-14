package com.java.exceptions;
//Unchecked
public class MyException1 extends RuntimeException {
	
	
	MyException1(String str){
		super(str);
	}
}


class MyException2 extends Exception {
	
	
	MyException2(String str){
		super(str);
	}
}