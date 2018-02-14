package com.java.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.business.MessageProcessor;

public class Client {

	public static void main(String args[]) {
		// To create proxy and return target class object
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-bean.xml");
		MessageProcessor proxy =  ctx
				.getBean("business", MessageProcessor.class);
		proxy.printMessage();
		ctx.close();
	}

}
