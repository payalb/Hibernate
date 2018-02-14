package com.java.chat.server;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Binder {

	public static void main(String[] args) throws RemoteException {
		ChatServer serverObj= new ChatServer();
		Registry registry= LocateRegistry.createRegistry(1099);
		registry.rebind("ChatServer", serverObj);
	}
}
