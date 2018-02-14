package com.java.services;

import org.springframework.aop.ThrowsAdvice;

public class ExceptionHandling implements ThrowsAdvice{
	
	public void afterThrowing(Exception e) throws Throwable{
		System.out.println("From throwsAdvice...");
		//Used for exception handling..
	}

}
