package com.java.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.model.LoginBean;

@Repository
public class HelloRepository {
	
	private static ArrayList<LoginBean> list= new ArrayList<>();
	
	public void save(LoginBean bean) {
		list.add(bean);
	}
	
	public List<LoginBean> getBeans(){
		return (List<LoginBean>) list.clone();
	}
	
}
