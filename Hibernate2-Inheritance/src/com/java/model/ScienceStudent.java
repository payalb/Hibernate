package com.java.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity

public class ScienceStudent extends Student{
	
	private double practicalMarks;

	public double getPracticalMarks() {
		return practicalMarks;
	}

	public void setPracticalMarks(double practicalMarks) {
		this.practicalMarks = practicalMarks;
	}
	
}
