package com.java.model;

import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyClass;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyJoinColumn;

@Entity(name = "st")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String location;
	@ElementCollection
	@MapKeyJoinColumn(name="Student_id")
	@CollectionTable(name="Student_Info")
	@Column(name="Student_Marks",columnDefinition="FLOAT")
	@MapKeyColumn(name="Student_Subject")
	@MapKeyClass(value=String.class)
	private Map<String,Float> subjects;

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

	public Map<String, Float> getSubjects() {
		return subjects;
	}

	public void setSubjects(Map<String, Float> subjects) {
		this.subjects = subjects;
	}



}
