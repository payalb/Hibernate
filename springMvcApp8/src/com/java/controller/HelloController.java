package com.java.controller;

import org.springframework.stereotype.Controller;
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
		return mv;
	}

	@RequestMapping(value = "/Validate", method = RequestMethod.POST)
	public ModelAndView getModelView(@ModelAttribute("bean") LoginBean bean1) {
		ModelAndView mv = new ModelAndView("Hello");
		bean1.getUsername();
		return mv;
	}
}
