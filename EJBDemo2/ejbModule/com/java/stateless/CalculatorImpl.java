package com.java.stateless;

import javax.ejb.Stateless;

@Stateless
public class CalculatorImpl implements Calculator {

	
	private static final long serialVersionUID = 1L;

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}

	@Override
	public float div(int a, int b) {
		return a/b;
	}

}
