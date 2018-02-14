package com.java.stateless;

import java.io.Serializable;
import java.rmi.RemoteException;

import javax.ejb.Remote;

@Remote
public interface Calculator extends Serializable{

	public int add(int a, int b)throws RemoteException;
	public int sub(int a, int b)throws RemoteException;
	public int mul(int a, int b)throws RemoteException;
	public float div(int a, int b)throws RemoteException;
	
}
