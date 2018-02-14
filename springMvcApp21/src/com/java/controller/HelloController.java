package com.java.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.ParameterizableViewController;


public class HelloController extends ParameterizableViewController{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		ModelAndView mv = new ModelAndView(getViewName());
		mv.addObject("message", "Hi, Welcome back to annotations!!");
		return mv;
	}
}
