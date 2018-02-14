package com.java.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;

public class LoginBean implements Serializable {

	private String username;
	private String password;
	private Date date;//"2012/12/10"
	private List<String> myList;
	private HashSet<Integer> mySet;
	private Long id;

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

	@Override
	public String toString() {
		return "LoginBean [username=" + username + ", password=" + password + ", date=" + date + ", myList=" + myList
				+ ", mySet=" + mySet + ", id=" + id + "]";
	}

}
