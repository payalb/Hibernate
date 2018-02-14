package com.java.chat.client;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import com.java.chat.server.Chattable;

public class ChatClient extends UnicastRemoteObject implements ClientInf, Runnable{
	private String name;
	private Chattable server;

	protected ChatClient(String name, Chattable server) throws RemoteException {
		super();
		this.name= name;
		this.server= server;
		server.registerClients(this);
	}

	@Override
	public void retrieveMessage(String message) throws RemoteException {
		System.out.println(message);
	}

	@Override
	public void run() {
		Scanner scanner= new Scanner(System.in);
		while(true){
			String message= scanner.nextLine();
			try {
				server.broadcastMessages(message);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
