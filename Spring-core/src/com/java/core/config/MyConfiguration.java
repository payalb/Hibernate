package com.java.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.java.core.dao.Address;
import com.java.core.dao.Person;

@Configuration
@Lazy
public class MyConfiguration {

	@Bean(name="address")
	public Address getAddressBean(){
		return new Address("10R", "Delhi Road","Meerut", "Uttar Pradesh", 250002);
	}
	
	@Bean(name="person")
	@DependsOn("address")
	@Scope("prototype")
	public Person getPersonBean(){
		Person p=  new Person("Payal", "GHF73464");
		p.setAddress(getAddressBean());
		return p;
	}
}
