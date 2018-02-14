package com.java;

import java.sql.Connection;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

public class Main {

	public static void main(String[] args) {
		BasicDataSource ds= new BasicDataSource();
		ds.setDriverClassName("org.postgresql.Driver");
		ds.setUrl("jdbc:postgresql://localhost/postgres");
		ds.setPassword("postgres");
		ds.setUsername("postgres");
		ds.setMaxActive(22);
		ds.setMaxIdle(15);
		ds.setMaxWait(30);
		for(int i=0; i<30;i++){
			try{
				Connection con= ds.getConnection();
				System.out.println(con);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		

	}

}
