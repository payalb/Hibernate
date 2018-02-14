package com.java.hellocontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.java.messaging.MyEvent;

public class HelloControllerOne implements Controller
	 {


	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage",
				"Hi User, welcome to the first Spring MVC Application");
		return modelandview;
	}

}