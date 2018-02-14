package com.java.hellocontroller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 @Controller
public class HelloControllerOne {

	 @RequestMapping("/welcome")
	public ModelAndView myHandler(Principal p) {
		ModelAndView modelandview = new ModelAndView("HelloPage");
		modelandview.addObject("welcomeMessage", "Hi User, welcome to the first Spring MVC Application");
		String name=p.getName();
		modelandview.addObject("username", name);
		return modelandview;
	}
}