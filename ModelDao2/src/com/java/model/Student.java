package com.java.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.java.annotations.Phone;


@Entity
@Table(name="student",schema="hibernatedb")
public class Student {
	@Id
	private int id;
	@Size(min=2, max=30)
	@NotEmpty
	private String name;
	@NotNull 
	private String location;
	@DateTimeFormat(pattern="MM/DD/YYYY")
	@Past
	private Date birthday;
	
	@Phone
	private String phone;
	@Email
	private String email;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
