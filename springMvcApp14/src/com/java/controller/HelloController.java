package com.java.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
	public ModelAndView getModelView(@ModelAttribute("bean") LoginBean bean1,
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
	
	@InitBinder
	public void addBinderFilter(WebDataBinder binder){
		/*binder.setDisallowedFields(new String[]{"date"});*/
		SimpleDateFormat format= new SimpleDateFormat("dd*MM*YYYY");
		binder.registerCustomEditor(Date.class, "date", new CustomDateEditor(format, false));
	}

}
