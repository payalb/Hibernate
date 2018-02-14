package com.java.bean;

import java.util.HashSet;
import java.util.Set;

public class Users {
	
	static Set< User> users= new HashSet<>();
	
	
	
	Users(){
		users.add(new User("abc", 21, "ds@hsd.com", 53636363l,1, "abc"));
		users.add( new User("ert", 32, "ert@hsd.com", 7367363l,12, "ert"));
	}

	public static Set<User> getUsers(){
		return users;
	}
	
	
	
}
