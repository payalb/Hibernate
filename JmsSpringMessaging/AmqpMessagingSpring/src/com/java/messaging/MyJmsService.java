package com.java.messaging;

public class MyJmsService {

	MyMessageSender sender;
	MyListener receiver;
	
	public void process() {
		sender.sendMessage("Hello");
		receiver.printMessage();
	}

}
