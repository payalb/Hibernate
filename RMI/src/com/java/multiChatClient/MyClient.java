package com.java.multiChatClient;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyClient extends Remote{

	public abstract void printMessage(String message) throws RemoteException;

}