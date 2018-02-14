package com.hmei.hibernate.pojo;

import java.util.Set;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.FetchProfile;
import org.hibernate.annotations.FetchProfile.FetchOverride;

@Entity
@Table(name="STUDENT")
/*@Cacheable(true)
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_ONLY)*/
@FetchProfile(name="student-address", fetchOverrides= {
		@FetchOverride(entity=Student.class, association="address", mode=FetchMode.JOIN)
})
public class Student {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="NAME")
	private String name;

	//fetch = FetchType.EAGER
	@OneToMany(cascade=CascadeType.ALL, mappedBy="student")
	@Column(name="ADDRESSES")
	private Set<Address> address;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="MARK")
	private int mark;
	
	public Student() {}

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


	public Set<Address> getAddress() {
		return address;
	}

	public void setAddress(Set<Address> address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		String str = id + " " + name + " " + email + " " + mark + " " + address;
		return str;
	}
	
	
}
	
