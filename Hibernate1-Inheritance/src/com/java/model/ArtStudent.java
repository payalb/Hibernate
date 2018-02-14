package com.java.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Arts")
public class ArtStudent extends Student{
	
	private double homeScienceMarks;

	public double getHomeScienceMarks() {
		return homeScienceMarks;
	}

	public void setHomeScienceMarks(double homeScienceMarks) {
		this.homeScienceMarks = homeScienceMarks;
	}

}
