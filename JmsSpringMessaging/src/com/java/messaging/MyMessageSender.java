package com.java.messaging;

import org.springframework.jms.core.JmsTemplate;

public class MyMessageSender {
	
	private JmsTemplate template;
	
	public void sendMessage(String message){
		template.convertAndSend("QueueOne", message);
	}

}
