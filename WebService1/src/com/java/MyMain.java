package com.java;

import javax.xml.ws.Endpoint;

public class MyMain {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8935/ws/MyService", new MyServiceImpl());
	}

}
