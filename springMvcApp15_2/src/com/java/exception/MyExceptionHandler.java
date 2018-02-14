package com.java.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyExceptionHandler{

	
	@ExceptionHandler
	public String myExceptionHandler() {
		return "/error";
	}
}
