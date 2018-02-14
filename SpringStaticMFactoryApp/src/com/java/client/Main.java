package com.java.client;

import java.sql.Connection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring-bean.xml");
		Connection con=(Connection) context.getBean("myConnection");

	}

}
