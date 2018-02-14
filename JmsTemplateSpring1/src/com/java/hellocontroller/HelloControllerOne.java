package com.java.hellocontroller;

import java.io.IOException;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import javax.jms.Topic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class HelloControllerOne implements MessageListener {
	
	private JmsTemplate template;
	private Topic topic;


	public static void main(String args[]) throws JMSException, IOException {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring.xml");
		HelloControllerOne obj = ctx.getBean("HelloControllerOne", HelloControllerOne.class);
	/*	TopicConnectionFactory factory= (TopicConnectionFactory) obj.template.getConnectionFactory();*/
	/*	TopicConnection con= factory.createTopicConnection();
		obj.publish(con, obj.topic);
		obj.subscribe(con, obj.topic, obj);
		System.out.println("sent!!");*/
		JmsTemplate template= obj.template;
		Topic topic= obj.topic;
		template.convertAndSend(topic, "Hi, am from publisher");
		
		/*System.exit(1);*/
	}


	/*private void subscribe(TopicConnection con, Topic topic2,
			HelloControllerOne obj) throws JMSException {
		TopicSession session= con.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		TopicSubscriber subscriber= session.createSubscriber(topic2);
		subscriber.setMessageListener(obj);
	}


	private void publish(TopicConnection con, Topic topic2) throws JMSException, IOException {
		TopicSession session= con.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
		 TopicPublisher publisher = session.createPublisher(topic2);
		 con.start();
		 BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		 String text=reader.readLine();
		 while(!text.equalsIgnoreCase("exit")){
		 TextMessage msg= session.createTextMessage();
		 msg.setText(text);
		 publisher.publish(msg);
		 }
		 con.close();
		 System.exit(0);
	}
*/

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


	public JmsTemplate getTemplate() {
		return template;
	}


	public void setTemplate(JmsTemplate template) {
		this.template = template;
	}


	public Topic getTopic() {
		return topic;
	}


	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}