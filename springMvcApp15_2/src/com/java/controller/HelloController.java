package com.java.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.component.MyCustomNameEditor;
import com.java.model.LoginBean;

@Controller
public class HelloController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView getModelView1() {
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}

	@RequestMapping(value = "/Validate", method = RequestMethod.POST)
	public ModelAndView getModelView(@Valid @ModelAttribute("bean") LoginBean bean1,
			BindingResult result) {
		ModelAndView mv = new ModelAndView("Hello");
		if (result.hasErrors()) {
			mv = new ModelAndView("login");
			return mv;
		} else {
			return mv;
		}
	}

	/*
	 * Will add this attribute to every model object with requestMapping in this
	 * controller
	 */
	@ModelAttribute
	public void headerMessage(Model model) {
		model.addAttribute("headerMessage", "Welcome User to my page!!");
	}
	
	/*
	 * To customize the accepted format of the field.
	 */
	@InitBinder
	public void addBinderFilter(WebDataBinder binder){
		binder.registerCustomEditor(String.class, "username", new MyCustomNameEditor());
	}
	
	@ExceptionHandler(value=RuntimeException.class)
	public String myExceptionHandler() {
		return "/error";
	}

}
