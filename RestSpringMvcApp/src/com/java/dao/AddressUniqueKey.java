package com.java.dao;

import javax.persistence.Embeddable;
import javax.xml.bind.annotation.XmlRootElement;


@Embeddable
@XmlRootElement
public class AddressUniqueKey {
	private int houseNo;
	private String street;
	private String city;
	public int getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}
