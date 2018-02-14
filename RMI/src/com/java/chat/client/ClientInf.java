package com.java.chat.client;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientInf extends Remote {

	void retrieveMessage(String message) throws RemoteException;
}
