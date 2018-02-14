package com.java.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import com.java.business.MessageProcessor;

@Aspect
public class LoggingNameAspect {

	@After("matches()")
	public void logAdvice(JoinPoint joinPoint) {
		System.out.println(joinPoint.toString());
		MessageProcessor obj= (MessageProcessor) joinPoint.getTarget();
		obj.getTeacher().setName("");
		System.out.println(obj.getTeacher().getName());
		System.out.println("Advice ran... Business method called..");
		
	}

	/*
	 * To run this advice with return type as String and for all methods 
	 * of Teacher class. For all return type, give it as Object.
	 */
	@AfterReturning(pointcut="within(com.java.model.Teacher)", returning="returnValue")
	public void logAdvice3(Object returnValue) {
		System.out.println("From advice 2...");
		System.out.println(returnValue);
	}

	/*
	 * To run this advice with exception object
	 */
	@AfterThrowing(pointcut="within(com.java.model.Teacher)", throwing="ex")
	public void logAdvice4(RuntimeException ex) {
		System.out.println("From advice 3...");
		System.out.println(ex.getMessage());
	}

	
	@Pointcut("execution(public * com.java.business..*(*))")
	public void matches() {

	}
}
