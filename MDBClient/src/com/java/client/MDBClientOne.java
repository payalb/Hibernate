package com.java.client;

import java.util.Properties;

import javax.jms.ConnectionFactory;
import javax.jms.JMSContext;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MDBClientOne implements MessageListener{

	public static void main(String args[]) throws NamingException{
		MDBClientOne listener= new MDBClientOne();
	Context context=	MDBClientOne.getInitialContext();
	Queue q1= (Queue) context.lookup("QueueOne");
	Queue q2= (Queue) context.lookup("QueueTwo");
	JMSContext jmsContext= ((ConnectionFactory)context.lookup("jms/connFactory")).createContext();
	jmsContext.createConsumer(q2).setMessageListener(listener);
	jmsContext.createProducer().send(q1, "hello am available now");
	}
	public void onMessage(Message message) {
		try {
			System.out.println(message.getBody(String.class));
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static Context getInitialContext() throws NamingException{
		Properties properties= new Properties();
		properties.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
		properties.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
		properties.setProperty("java.naming.provider.url", "iiop://localhost:3700");
		InitialContext ctx= new InitialContext(properties);
		return ctx;
		
	}
}
