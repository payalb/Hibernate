package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/proj")
public class HelloController {

	@RequestMapping("/{username}/{city}")
	public ModelAndView getModelView(@PathVariable("username") String name,
			@PathVariable("city") String city) {
		ModelAndView mv = new ModelAndView("Hello");
		mv.addObject("message", name + " from "+ city);	
		return mv;
	}
	
	@RequestMapping("/two")
	public ModelAndView getModelView1() {
		ModelAndView mv = new ModelAndView("Hello");
		mv.addObject("message", "Method for 2!!");
		return mv;
	}
}
