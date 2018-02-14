package com.java.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="Id")
public class ArtStudent extends Student{
	
	private double homeScienceMarks;

	public double getHomeScienceMarks() {
		return homeScienceMarks;
	}

	public void setHomeScienceMarks(double homeScienceMarks) {
		this.homeScienceMarks = homeScienceMarks;
	}

}
