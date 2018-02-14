package com.java.messaging;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class MyEventPublisher implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher= applicationEventPublisher;
	}
	
	public void send(String text){
		this.applicationEventPublisher.publishEvent(new MyEvent(text));
	}

}
