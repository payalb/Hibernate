package com.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.entity.Login;

@Controller
public class MyController {	
	
	
	
	@RequestMapping( value="/index.html",method=RequestMethod.GET)
	public ModelAndView getLogin(){
		ModelAndView mv= new ModelAndView("index1");
		Login login= new Login();
		mv.addObject("login", login);
		return mv;
	}
	
	@RequestMapping(value="/Validate.html", method=RequestMethod.POST)
	public ModelAndView validateForm( @ModelAttribute("login") Login login, BindingResult result){
		ModelAndView mv= new ModelAndView();
		mv.setViewName("Login");
		if(result.hasErrors()){
			mv.addObject("status","Error");
		}
	
		if(!StringUtils.isEmpty(login.getUsername()) && !StringUtils.isEmpty(login.getPassword()))	{
			mv.addObject("status", "<h2>Welcome "+ login.getUsername() +" !</h2>" );
		}else{
			mv.addObject("status",  "<h2> Invalid Login! Please register yourself </h2>");
		}
		return mv;
	}

}
