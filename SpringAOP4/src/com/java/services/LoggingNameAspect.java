package com.java.services;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class LoggingNameAspect {
	//public void m1(String st)
	@Before("execution(public * *.*(..))")
	public void logAdvice(JoinPoint joinPoint){
		System.out.println(joinPoint.toString());
		System.out.println("Advice ran... Business method called..");
	}

	@Before("matches()")
	public void logAdvice1(JoinPoint joinPoint){
		System.out.println(joinPoint.toString());
		System.out.println("Advice1 ran... Business method called..");
	}
	
	
	// * For all methods of this class:
	 
	@Before("within(com.java.business.MessageProcessor)")
	public void logAdvice2(){
		System.out.println("Advice2 ran... Business method called..");
	}
	
	/*
	 * For all sub-packages in business package...:
	 */
	@Pointcut("within(com.java.business..*)")
	public void logAdvice3(){
	}
	
	/*
	 * Methods with :arguments matching
	 * Takes in class/ interface name.*/
	 
	@Before("args(java.lang.Integer)")
	public void logAdvice4(){
		System.out.println("Advice4 ran... Business method called..");
	}
	
	@Before("matches() && logAdvice3()")
	public void logAdvice5(){
		System.out.println("Advice5 ran... Business method called..");
	}
	
	
	@Pointcut("execution(public void com.java.business.MessageProcessor.printMessage())")
	public void matches(){
		
	}
}
