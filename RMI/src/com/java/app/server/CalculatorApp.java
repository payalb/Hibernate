package com.java.app.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorApp extends Remote{

	public abstract int add(int numberOne, int number2) throws RemoteException;

	public abstract int sub(int numberOne, int number2) throws RemoteException;

	public abstract int mul(int numberOne, int number2) throws RemoteException;

	public abstract int div(int numberOne, int number2) throws RemoteException;

}