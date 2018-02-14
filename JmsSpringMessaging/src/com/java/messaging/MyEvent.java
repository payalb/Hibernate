package com.java.messaging;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent {

	private static final long serialVersionUID = 9142350271165649527L;
	private String message;
	public MyEvent(String text) {
		super(text);
		this.setMessage(text);
}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
