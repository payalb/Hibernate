package com.java.aspects.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging {
	@Before(value = "execution(public void headerMessage(Model model))")
	public void loggingAdvice(){
		System.out.println("Advice run...");
	}

}
