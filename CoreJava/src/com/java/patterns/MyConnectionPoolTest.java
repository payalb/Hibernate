package com.java.patterns;

import java.util.List;

public class MyConnectionPoolTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		MyConnectionPool obj1= MyConnectionPool.getInstance();
		System.out.println(obj1);
		List list= obj1.getConnections();
		list.add("sdfdsfds");
		MyConnectionPool obj2= MyConnectionPool.getInstance();
		System.out.println(obj2);
		System.out.println(obj2.getConnections().size());
		System.out.println(obj1==obj2);
		Object obj= MyConnectionPool.getInstance();
		
	//	MyConnectionPool obj3=  (MyConnectionPool) obj2.clone();
		
		//System.out.println(obj3==obj2);
	}

}
