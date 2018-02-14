package com.java.services;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import com.java.business.MessageProcessor;


public class LoggingNameAspect {

	
	public Object logAdvice(ProceedingJoinPoint joinPoint) {
		Object returnvalue= null;
		System.out.println(joinPoint.toString());
		MessageProcessor obj= (MessageProcessor) joinPoint.getTarget();
		obj.getTeacher().setName("Shreya");
		try {
			returnvalue= joinPoint.proceed();
			System.out.println(obj.getTeacher().getName());
			System.out.println("Advice ran... Business method called..");

		} catch (Throwable e) {
			System.out.println("After throwing...");
			e.printStackTrace();
		}
		System.out.println("Method ended!!"+ returnvalue);
		return returnvalue;
		}

	
	

}
