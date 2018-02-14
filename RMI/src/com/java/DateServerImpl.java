package com.java;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
/*
All remote object implementation must extend RemoteObject or one of its subclasses
(such as the UnicastRemoteObject, provided by the JDK for implementing TCP-based
client-server programs).*/
public class DateServerImpl extends UnicastRemoteObject implements DateServer{
	
	private Date date;

	protected DateServerImpl() throws RemoteException {
		super();
	}

	@Override
	public Date getDate() throws RemoteException {
		return new Date();
	}

	
}
