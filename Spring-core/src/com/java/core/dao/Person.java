package com.java.core.dao;

import java.beans.ConstructorProperties;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

public class Person implements InitializingBean {
	private String name;
	@Autowired
	private Address address;
	private String aadharCardNo;
	
	@ConstructorProperties({"name", "aadharCardNo"})
	public Person(String name, String aadharCardNo) {
		super();
		this.name = name;
		this.aadharCardNo = aadharCardNo;
	}
/*	public void setName(String name) {
		this.name = name;
	}
	public void setAadharCardNo(String aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}*/
	public void setAddress(Address address) {
		this.address = address;
	}
	/*public String getName() {
		return name;
	}*/
	public Address getAddress() {
		return address;
	}
	/*public String getAadharCardNo() {
		return aadharCardNo;
	}*/
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Person class initialized!!");
		
	}
	
}
