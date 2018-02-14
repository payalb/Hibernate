package com.java.services;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.springframework.aop.ThrowsAdvice;

public class ExceptionHandlingAspect implements ThrowsAdvice{

	
	public void afterThrowing(Exception e) throws Throwable{
		System.out.println("From throwsAdvice...");
		//Used for exception handling..
	}

}
