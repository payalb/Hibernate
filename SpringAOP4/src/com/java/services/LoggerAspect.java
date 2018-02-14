package com.java.services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

public class LoggerAspect implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] params, Object target)
			throws Throwable {
			System.out.println("Hello from MBA...Business logic to be executed...");
			Log l= LogFactory.getLog(LoggerAspect.class);
			l.info("Hello from MBA...Business logic to be executed...");
			
	}
}
