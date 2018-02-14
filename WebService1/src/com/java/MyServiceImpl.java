package com.java;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface="com.java.MyService")
public class MyServiceImpl implements MyService {
	
	public MyServiceImpl(){
	}
	@PostConstruct
	public void init(){
		System.out.println("Service ready to be used!!");
	}
	
	@WebMethod
	public int add(int a, int b){
		return a+b;
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("Service connection closed!");
	}

}
