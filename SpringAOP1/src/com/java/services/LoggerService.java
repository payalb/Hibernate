package com.java.services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import com.java.business.MessageProcessor;

public class LoggerService implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] params, Object target)
			throws Throwable {
			System.out.println("Hello from MBA...Business logic to be executed...");
			Log l= LogFactory.getLog(LoggerService.class);
			System.out.println(method.getName());
			System.out.println(params[0]);
			System.out.println(target);
			l.info("Hello from MBA...Business logic to be executed...");
			
	}
}
