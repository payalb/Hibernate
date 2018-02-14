package com.java.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ANIMAL")
public class Animal implements Serializable {

	private static final long serialVersionUID = 1011938467144512254L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	
	private String name;
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return this.id + " is the id of " + this.getName() + ". It's type is: "
				+ this.getType();
	}

	public void setId(int id) {
		this.id=id;
		
	}
}
