package com.java.producer;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.Session;

@Singleton
@Startup
public class MessageOneProducer {
	@Resource(lookup="jms/connFactory")
	private static ConnectionFactory factory;
	@Resource(lookup="jms/QueueOne")
	private Queue queue;

	@PostConstruct
	public void init() {
		QueueConnection connection= null;
		try {
			connection = (QueueConnection) factory.createConnection();
			Session session= connection.createSession(false, 0);
			MessageProducer producer =session.createProducer(queue);
			Message message= session.createTextMessage("Hi there!");
			
			producer.send(message);
			
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//connection.close();
		}
	}

}
