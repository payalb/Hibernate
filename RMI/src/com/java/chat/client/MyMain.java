package com.java.chat.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import com.java.chat.server.Chattable;

public class MyMain {

	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		Chattable server = (Chattable) Naming.lookup("rmi://localhost:1099/ChatServer");
		new Thread(new ChatClient("payal", server)).start();
		server.broadcastMessages("You are now connected!!");
	}

}
