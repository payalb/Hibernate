package com.java.services;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterBusinessAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object businessObject) throws Throwable {
		System.out.println("After returning advice called...");
		System.out.println(returnValue);
		System.out.println(method.getName());
	}

}
