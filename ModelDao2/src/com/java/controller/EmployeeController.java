package com.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.business.StudentBO;
import com.java.model.Student;

@Controller
public class EmployeeController {

	@Autowired
	private StudentBO bo;

	
	@RequestMapping(value = "/empsave", method = RequestMethod.POST)
	public ModelAndView processReq(@ModelAttribute Student st) {
		ModelAndView mv = new ModelAndView("Result");
		int i = bo.createStudent(st);
		if (i != 0) {
			mv.addObject("message", "success");
		} else {
			mv.addObject("message", "failure");
		}
		return mv;
	}

}
