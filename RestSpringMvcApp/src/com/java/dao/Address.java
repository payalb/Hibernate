package com.java.dao;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@XmlRootElement
public class Address {

	@EmbeddedId
	private AddressUniqueKey id;
	private long pincode;
	
	public AddressUniqueKey getId() {
		return id;
	}
	public void setId(AddressUniqueKey id) {
		this.id = id;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
}
