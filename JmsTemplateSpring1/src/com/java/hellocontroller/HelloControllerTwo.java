package com.java.hellocontroller;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class HelloControllerTwo implements MessageListener {


	@Override
	public void onMessage(Message msg) {
			if(msg instanceof TextMessage){
				TextMessage tm= (TextMessage) msg;
				try {
					System.out.println(tm.getText());
				} catch (JMSException e) {
					e.printStackTrace();
				}
				
			}else{
				throw new RuntimeException("Invalid format!!");
			}
	}


}