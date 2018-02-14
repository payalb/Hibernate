package com.java.spring.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacts")
public class Contact {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	private String name;
	private String email;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
