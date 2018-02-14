package com.java.chat.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import com.java.chat.client.ClientInf;

public class ChatServer extends UnicastRemoteObject implements Chattable{

	private List<ClientInf> listOfClients;
	protected ChatServer() throws RemoteException {
		super();
		listOfClients= new ArrayList<>();
	}

	@Override
	public synchronized void registerClients(ClientInf client) {
		listOfClients.add(client);
	}

	@Override
	public void broadcastMessages(String message) throws RemoteException {
	/*	listOfClients.forEach(new Consumer<ClientInf>(){

			@Override
			public void accept(ClientInf client) {
				try {
					client.retrieveMessage(message);
				} catch (RemoteException e) {
					e.printStackTrace();
				}
			}
			
		});*/
		
		for(ClientInf client: listOfClients){
			client.retrieveMessage(message);
		}
	}

	
}
