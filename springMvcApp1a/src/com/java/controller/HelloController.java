package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/welcome")
	public ModelAndView getModelView() {
		ModelAndView mv = new ModelAndView("Hello");
		mv.addObject("message", "Hi, Welcome back to annotations!!");
		return mv;
	}
	/*
	 * @RequestMapping("/hello") public ModelAndView getModelView1() {
	 * ModelAndView mv = new ModelAndView("Hello"); mv.addObject("message",
	 * "Hi, Welcome back to annotations!!"); return mv; }
	 */
}
