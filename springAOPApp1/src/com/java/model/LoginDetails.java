package com.java.model;

import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class LoginDetails {

	private String username;
	private String password;
	private Date date;
	private List<String> myList;
	private HashSet<Integer> mySet;
	private Long id;
	private Address address;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List getMyList() {
		return myList;
	}

	public void setMyList(List myList) {
		this.myList = myList;
	}

	public HashSet getMySet() {
		return mySet;
	}

	public void setMySet(HashSet mySet) {
		this.mySet = mySet;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
