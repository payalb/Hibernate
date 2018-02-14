package com.java.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.java.spring.dto.Contact;

@RepositoryRestResource
public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
