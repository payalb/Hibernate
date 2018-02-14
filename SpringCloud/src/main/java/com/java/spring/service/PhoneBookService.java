package com.java.spring.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.java.spring.dao.ContactRepository;
import com.java.spring.dto.Contact;

@Service
public class PhoneBookService {

	@Autowired
	private ContactRepository repository;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public List<Contact> getAllContacts(){
		return repository.findAll();
	}
	
}
