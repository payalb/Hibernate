package com.java.model;

import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name="teacher")
public class Teacher {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int tid;
	@Column(name="tLocation")
	private String location;
	//treated as field which should be persisted.
	//If we need to configure other things like fetch, optional
	@Basic(optional= true)
	private String name;
	@ManyToMany(cascade=CascadeType.ALL, fetch= FetchType.LAZY)
	@JoinTable(name="Temp", 
	joinColumns={@JoinColumn(name="tid")},
	inverseJoinColumns={@JoinColumn(name="sid")})
	private Set<Student> students;
	


	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	

}
