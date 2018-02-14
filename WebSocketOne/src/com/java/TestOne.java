package com.java;

import javax.net.websocket.Endpoint;
import javax.net.websocket.MessageHandler;
import javax.net.websocket.Session;

public class TestOne extends Endpoint{

	@Override
	public void onOpen(Session session) {
		session.addMessageHandler(new MessageHandler.Text() {
			
			@Override
			public void onMessage(String message) {
				System.out.println(message);
			}
		});
	}

}
