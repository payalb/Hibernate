package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.model.LoginBean;

@Controller
public class HelloController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getModelView1() {
		ModelAndView mv = new ModelAndView("login");
		//mv.addObject("headerMessage", "Welcome User!!");
		return mv;
	}

	@RequestMapping(value = "/Validate", method = RequestMethod.POST)
	public ModelAndView getModelView(@ModelAttribute("bean") LoginBean bean) {
		ModelAndView mv = new ModelAndView("Hello");
		//mv.addObject("headerMessage", "Welcome User!!");
		return mv;
	}
	/*
	 * Will add this attribute to every model object with requestMapping
	 * in this controller
	 */
	@ModelAttribute
	public void headerMessage(Model model){
		model.addAttribute("headerMessage", "Welcome User to my page!!");
	}
	
}
