package com.java.services;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class BusinessPointcut extends StaticMethodMatcherPointcut{

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		String methodName= method.getName();
		if(methodName.equalsIgnoreCase("processMessage"))
			return true;
			
		return false;
	}

}
