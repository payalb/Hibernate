package com.java.PaypalInteg.servlet;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.PaypalInteg.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping(path="/employee", method=RequestMethod.GET)
	@ResponseBody
	public Employee print(){
		Employee emp= new Employee();
		emp.setFirstName("Payal");
		emp.setEmail("jahanvi.bansal@gmail.com");
		emp.setId(1);
		emp.setLastName("Bansal");
		return emp ;
	}
}
