package com.java.patterns;

import java.util.ArrayList;
import java.util.List;

public class MyConnectionPool implements Cloneable {

	private static MyConnectionPool pool = new MyConnectionPool();

	private String name;
	private int numberOfConnections;
	private List<Object> connections = new ArrayList<>();

	private MyConnectionPool() {
		if (pool != null) {
			throw new UnsupportedOperationException();
		}
	}

	public static MyConnectionPool getInstance() {
		return pool;
	}


	public String getName() {
		return name;
	}

	public int getNumberOfConnections() {
		return numberOfConnections;
	}

	public List<Object> getConnections() {
		return new ArrayList(connections);
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new UnsupportedOperationException();
	}

}
