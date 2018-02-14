package com.java.beans;

import javax.annotation.Resource;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;

/**
 * Message-Driven Bean implementation class for: MessageBean
 */
@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "QueueOne"), @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Queue")
		}, 
		mappedName = "QueueOne")
public class MessageBean implements MessageListener {
	@Inject JMSContext context;
	@Resource(mappedName= "QueueTwo")
	Queue queue;
    public void onMessage(Message message) {
    	try {
			System.out.println(message.getBody(String.class));
			context.createProducer().send(queue, message.getBody(String.class));
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
    }

}
