package com.java.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Science")
public class ScienceStudent extends Student{

	private double practicalMarks;

	public double getPracticalMarks() {
		return practicalMarks;
	}

	public void setPracticalMarks(double practicalMarks) {
		this.practicalMarks = practicalMarks;
	}
	

}
