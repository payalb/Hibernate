package com.java.chat.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.java.chat.client.ClientInf;

public interface Chattable extends Remote{

	public void registerClients(ClientInf client) throws RemoteException;
	
	public void broadcastMessages(String message)throws RemoteException;
}
