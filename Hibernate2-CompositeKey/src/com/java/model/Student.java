package com.java.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "st")
public class Student {
	@EmbeddedId
	private Key key;
	private float marks;
	
	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	
	


}
