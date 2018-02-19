/*package com.java.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//Unidirectional Mapping
@Entity

 public class Student {
	@Id
	private int id;
	private String name;
	@OneToMany(mappedBy="student")
	private List<Address> addresses;
	
	protected Student(){
		
	}
	public Student(int id, String name, List<Address> addresses) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = addresses;
	}
	public String getName() {
		return name;
	}
	public void setName(String sName) {
		this.name = sName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public List<Address> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	public String toString(){
		return this.getName()+", "+ this.getId()+" ,"+ this.getAddresses();
	}

}
*/