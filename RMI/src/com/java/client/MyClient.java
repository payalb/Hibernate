package com.java.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.java.DateServer;

public class MyClient {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		DateServer obj= (DateServer) Naming.lookup("rmi://127.0.0.1:1099/dateServer");
		System.out.println("Date received "+ obj.getDate());
	}

}
