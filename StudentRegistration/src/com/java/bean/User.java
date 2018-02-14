package com.java.bean;

public class User {

	public User(String name, int age, String emailID, long phoneNumber,
			int standard, String password) {
		super();
		this.name = name;
		this.age = age;
		this.emailID = emailID;
		this.phoneNumber = phoneNumber;
		this.standard = standard;
		this.password = password;
	}
	private String name;
	private int age;
	private String emailID;
	private long phoneNumber;
	private int standard;
	private String password;
	private double fees;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + standard;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (emailID == null) {
			if (other.emailID != null)
				return false;
		} else if (!emailID.equals(other.emailID))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (standard != other.standard)
			return false;
		return true;
	}
}
