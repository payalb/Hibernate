package com.java.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jws.WebMethod;
import javax.jws.WebService;

public class MyServiceImpl implements MyService {
	
	public MyServiceImpl(){
	}
	public void init(){
		System.out.println("Service ready to be used!!");
	}
	
	public int add(int a, int b){
		return a+b;
	}
	
	public void destroy(){
		System.out.println("Service connection closed!");
	}

}
