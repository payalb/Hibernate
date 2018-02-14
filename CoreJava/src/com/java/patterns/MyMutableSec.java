package com.java.patterns;

import java.util.ArrayList;
import java.util.List;

public  final class MyMutableSec implements Cloneable {


	private String name;
	private int numberOfConnections;
	private List<Object> connections = new ArrayList<>();


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
