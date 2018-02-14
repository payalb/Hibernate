package com.java.client;

import java.rmi.RemoteException;

import com.java.service.MyServiceStub;

public class MyClient {

	public static void main(String[] args) throws RemoteException {
		MyServiceStub stub= new MyServiceStub();
		MyServiceStub.PrintMessage obj= new MyServiceStub.PrintMessage();
		obj.setMessage("Hello World");
		MyServiceStub.PrintMessageResponse resp= stub.printMessage(obj);
		String message= resp.get_return();
		System.out.println(message);
	}

}
