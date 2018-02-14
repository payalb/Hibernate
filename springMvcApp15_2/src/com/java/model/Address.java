package com.java.model;

import javax.validation.constraints.Max;

import org.hibernate.validator.constraints.NotEmpty;

public class Address {
	@NotEmpty(message="Street cannot be empty")
	private String street;
	@Max(999999)
	private String pincode;
	
	private String houseNumber;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	

}
