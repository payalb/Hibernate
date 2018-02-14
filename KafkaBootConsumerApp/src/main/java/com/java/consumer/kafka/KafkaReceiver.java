package com.java.consumer.kafka;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaReceiver {
	
	
	@KafkaListener(topics={"custom-topic"}, id="test")
	public void onMessage(String message) {
		System.out.println("Message received is "+message);
		
		
	}

}
