package com.java.messaging;

import org.springframework.amqp.core.AmqpTemplate;


public class MyMessageSender {
	
	private AmqpTemplate template;
	
	public void sendMessage(String message){
		template.convertAndSend("myExchange","my.routing.key", message);
	}

}
