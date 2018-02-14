package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value="/Validate", method= RequestMethod.GET)
	public ModelAndView getModelView(@RequestParam("username") String name,
			@RequestParam("password") String password) {
		ModelAndView mv = new ModelAndView("Hello");
		mv.addObject("message", name + " from "+ password);	
		return mv;
	}
	
	@RequestMapping(value="/login", method= RequestMethod.GET)
	public ModelAndView getModelView1() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
}
