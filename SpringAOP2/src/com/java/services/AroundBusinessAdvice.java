package com.java.services;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundBusinessAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("From interceptor..before business");
		methodInvocation.proceed();
		Object params[]=methodInvocation.getArguments();
		Method m= methodInvocation.getMethod();
		System.out.println(m.getName());
		System.out.println("From interceptor..After business");
		return null;
	}

}
