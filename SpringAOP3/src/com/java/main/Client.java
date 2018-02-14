package com.java.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.business.MessageProcessor;

public class Client {

	public static void main(String args[]) {
		// To create proxy and return target class object
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-bean.xml");
		MessageProcessor proxy = (MessageProcessor) ctx
				.getBean("proxyFactoryBean");

		proxy.processMessage(80);
		proxy.printMessage();
		ctx.close();
	}

}
