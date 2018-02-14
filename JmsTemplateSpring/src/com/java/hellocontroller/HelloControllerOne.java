package com.java.hellocontroller;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.apache.activemq.command.ActiveMQDestination;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class HelloControllerOne {

	public static void main(String args[]) throws JMSException {

		AbstractApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		JmsTemplate template = ctx.getBean("template", JmsTemplate.class);
	/*	template.send("Queue1", new MessageCreator() {

			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage msg =  session.createTextMessage();
				msg.setText("Hello 1");
				return msg;
			}
		});*/
		ActiveMQDestination destination= ctx.getBean("destination",ActiveMQDestination.class);
		String message= "hello";
		template.convertAndSend(destination, message);
		System.out.println("sent!!");
		Message msg= template.receive(destination);
		if(msg instanceof TextMessage){
			String msgText= ((TextMessage)msg).getText();
			System.out.println("msg recvd "+ msgText);
		}
		ctx.close();
	}
}