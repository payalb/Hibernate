package com.java.messaging;

import org.springframework.context.ApplicationListener;

public class MyListener implements ApplicationListener<MyEvent>{

	@Override
	public void onApplicationEvent(MyEvent event) {
		System.out.println(event.getMessage());
	}

}
