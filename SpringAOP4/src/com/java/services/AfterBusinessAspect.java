package com.java.services;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AfterBusinessAspect {

	@After(value = "execution()")
	public void afterReturning() {
		System.out.println("After returning advice called...");
	}

}
