package com.java.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="Id1")
public class ScienceStudent extends Student{
	
	private double practicalMarks;

	public double getPracticalMarks() {
		return practicalMarks;
	}

	public void setPracticalMarks(double practicalMarks) {
		this.practicalMarks = practicalMarks;
	}
	
}
