package com.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.dto.Contact;
import com.java.spring.service.PhoneBookService;

@RestController
public class ContactController {
	@Autowired
	PhoneBookService service;
	
	@RequestMapping(value="/")
	public List<Contact> getAllContacts(){
		return service.getAllContacts();
	}
}
