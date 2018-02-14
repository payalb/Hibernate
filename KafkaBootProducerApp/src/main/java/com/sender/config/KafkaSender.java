package com.sender.config;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.kafka.support.SendResult;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

public class KafkaSender {

	@Autowired
	KafkaTemplate<Integer, String> template;
	
	public void sendMessage(String topic, Integer key, String message) throws InterruptedException, ExecutionException{
		Message<String> msg= MessageBuilder.withPayload(message).setHeader(KafkaHeaders.MESSAGE_KEY,key).setHeader(KafkaHeaders.TOPIC, topic).build();
		ListenableFuture<SendResult<Integer, String>> future= template.send( msg);
		/*System.out.println(future.get());*/
		
		future.addCallback(new ListenableFutureCallback<SendResult<Integer, String>>(){

			@Override
			public void onSuccess(SendResult<Integer, String> result) {
				System.out.println("Success callback"+ result.getRecordMetadata().topic());
				
			}

			@Override
			public void onFailure(Throwable error) {
				error.printStackTrace();
				
			}

			
			
		});
	}
}
