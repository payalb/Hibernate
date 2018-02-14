package com.java.model;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OrderColumn;

@Entity(name = "st")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String location;
	@ElementCollection
	@OrderColumn(name="Index")
	@CollectionTable(name="Student_Subjects", joinColumns=@JoinColumn(name="Student_ID"))
	private List<String> subjects;
	@ElementCollection
	@OrderColumn(name="Index")
	private List<Float> marks;

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

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	public List<Float> getMarks() {
		return marks;
	}

	public void setMarks(List<Float> marks) {
		this.marks = marks;
	}

}
