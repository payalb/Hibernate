package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login.html")
	public ModelAndView login(@ModelAttribute("login")Login login , ModelAndView mv) {
		mv.setViewName("login");
		mv.addObject("login",login);
		System.out.println("In controller"+ login.getUsername());
		return mv;
	}

}
