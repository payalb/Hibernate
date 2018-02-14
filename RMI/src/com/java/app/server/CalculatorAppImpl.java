package com.java.app.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorAppImpl extends UnicastRemoteObject implements CalculatorApp {

	private static final long serialVersionUID = 1L;

	public CalculatorAppImpl() throws RemoteException {
		super();
	}

	@Override
	public int add(int numberOne, int number2) {
		return numberOne + number2;
	}

	@Override
	public int sub(int numberOne, int number2)  {
		return numberOne - number2;
	}

	@Override
	public int mul(int numberOne, int number2) {
		return numberOne * number2;
	}

	@Override
	public int div(int numberOne, int number2) {
		return numberOne / number2;
	}
}
