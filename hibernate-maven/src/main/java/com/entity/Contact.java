package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/* --------------------------------Entity Type:--------------------------------------------------------*/

@Entity
public class Contact {
	
	@Id
	private int id;
	
	private Name name;
	
	private String notes;
	@Column(nullable=false)
	private boolean starred;
	private String website;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public boolean isStarred() {
		return starred;
	}
	public void setStarred(boolean starred) {
		this.starred = starred;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	
}
