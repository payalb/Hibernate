package com.java.hellocontroller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.messaging.MyJmsService;


public class Hello {
	
	public static void main(String args[]){
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		MyJmsService service= (MyJmsService) ctx.getBean("jmsService");
		service.process();
	}



}