package com.java.core.dao;

import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean{
	private String street;
	private String houseNo;
	private String city;
	private String state;
	private int pincode;
	public Address( String houseNo, String street,String city, String state,
			int pincode) {
		super();
		this.street = street;
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Address class Initialized");
		
	}
}
