package com.java.app.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class CalculatorBinding {

	public static void main(String[] args) throws RemoteException, MalformedURLException, AlreadyBoundException {

		CalculatorApp calculator= new CalculatorAppImpl();
		System.out.println("Registering the object...");
		Naming.bind("CalculatorApplication", calculator);
		System.out.println("Registered...");
	}

}
