package com.java.multichatServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.java.multiChatClient.MyClient;

public interface MyServer extends Remote{
	public void broadcastMessage(String message) throws RemoteException;

	public void addClient(MyClient client)throws RemoteException;
}
