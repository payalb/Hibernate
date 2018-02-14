package com.java.main;

import org.springframework.aop.framework.ProxyFactoryBean;

import com.java.business.MessageProcessor;
import com.java.services.AfterBusinessAdvice;
import com.java.services.LoggerService;
import com.java.services.AroundBusinessAdvice;
import com.java.services.ExceptionHandling;

public class Client {
	
	public static void main(String args[]){
		
		//To add services to business
		MessageProcessor obj= new MessageProcessor();
		AfterBusinessAdvice s1= new AfterBusinessAdvice();
		LoggerService s2= new LoggerService();
		AroundBusinessAdvice s3= new AroundBusinessAdvice();
		ExceptionHandling s4= new ExceptionHandling();
		
		ProxyFactoryBean pfb= new ProxyFactoryBean();
		pfb.setTarget(obj);
		pfb.addAdvice(s1);
		pfb.addAdvice(s2);
		pfb.addAdvice(s3);
		pfb.addAdvice(s4);
		/*pfb.setInterceptorNames(new String[]{"s1","s2","s3","s4"});*/
		//To create proxy and return target class object
		MessageProcessor proxy= (MessageProcessor) pfb.getObject();
		proxy.processMessage(80);
	}

}
