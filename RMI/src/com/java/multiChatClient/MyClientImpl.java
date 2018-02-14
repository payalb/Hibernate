package com.java.multiChatClient;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Scanner;

import com.java.multichatServer.MyServer;

public class MyClientImpl extends UnicastRemoteObject implements MyClient , Runnable{
	
	private static final long serialVersionUID = 1L;
	public MyServer server;
	
	protected MyClientImpl(MyServer server) throws RemoteException {
		super();
		this.server= server;
		server.addClient(this);
	}

	@Override
	public void run(){
		Scanner scanner= new Scanner(System.in);
		String message;
		
		while((message= scanner.nextLine())!=null)
			try {
				server.broadcastMessage(message);
			} catch (RemoteException e) {
				e.printStackTrace();
			}
	}

	@Override
	public void printMessage(String message) throws RemoteException {
		System.out.println(message);
	}
	
	

}
