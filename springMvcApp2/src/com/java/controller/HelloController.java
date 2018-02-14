package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/proj")
public class HelloController {

	@RequestMapping("/one")
	public ModelAndView getModelView() {
		ModelAndView mv = new ModelAndView("Hello");
		mv.addObject("message", "Hi, method for 1!!");
		return mv;
	}
	
	@RequestMapping("/two")
	public ModelAndView getModelView1() {
		ModelAndView mv = new ModelAndView("Hello");
		mv.addObject("message", "Method for 2!!");
		return mv;
	}
}
