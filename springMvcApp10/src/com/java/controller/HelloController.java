package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.java.dao.HelloRepository;
import com.java.model.LoginBean;

@Controller
@SessionAttributes("bean")
public class HelloController {
	
	@Autowired
	HelloRepository repository;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getModelView1(SessionStatus status) {
	//	status.setComplete();
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("bean", new LoginBean());
		
		return mv;
	}

	@RequestMapping(value = "/Validate", method = RequestMethod.POST)
	public ModelAndView getModelView(@ModelAttribute("bean") LoginBean bean1, BindingResult result) {
		System.out.println(bean1.getUsername()+"*******2");
		if(result.hasErrors())
			return new ModelAndView("loginForm");
		repository.save(bean1);
		System.out.println(repository.getBeans());
		ModelAndView mv = new ModelAndView("Hello");
		return mv;
	}

	
	@RequestMapping(value = "/details", method = RequestMethod.POST)
	public String getModelView1(@ModelAttribute("bean") LoginBean bean1) {
		System.out.println(bean1.getUsername()+"*******1");
		return "loginForm";
	}
	/*
	 * Will add this attribute to every model object with requestMapping in this
	 * controller
	 */
	@ModelAttribute
	public void headerMessage(Model model) {
		model.addAttribute("headerMessage", "Welcome User to my page!!");
	}

}
