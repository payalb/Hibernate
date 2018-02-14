package com.java.messaging;



public class MyMessageSender {
	
	private AmqpTemplate template;
	
	public void sendMessage(String message){
		template.convertAndSend("myExchange","my.routing.key", message);
	}

}
