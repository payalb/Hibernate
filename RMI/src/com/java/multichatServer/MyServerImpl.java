package com.java.multichatServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

import com.java.multiChatClient.MyClient;

public class MyServerImpl extends UnicastRemoteObject implements MyServer{
	private static final long serialVersionUID = 1L;
	private List<MyClient> clients= new ArrayList<>();
	
	protected MyServerImpl() throws RemoteException {
		super();
	}

	public void broadcastMessage(String message) throws RemoteException{
		for(MyClient client: clients){
		client.printMessage(message);
		}
	}

	@Override
	public void addClient(MyClient client) throws RemoteException {
		clients.add(client);
	}
	
	

}
