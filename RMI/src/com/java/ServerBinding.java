package com.java;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServerBinding {

		public static void main(String args[]) throws RemoteException, MalformedURLException, AlreadyBoundException{
			DateServerImpl obj = new DateServerImpl();
			System.out.println("Registering to the registry..");
			/*If the name is
			already registered, then an AlreadyBoundException will be raised. To overcome this, we
			could use the rebind method instead of the bind method.*/
			Registry registry= LocateRegistry.createRegistry(1099);
			//1099 well known port for registry. Canbe changed
			//Naming.rebind("dateServer", obj);
			registry.rebind("dateServer", obj);
			System.out.println("Registered!!");
		}
	/*
		The third step is to generate the stub and the skeleton programs:
			rmic DateServerImpl
			The two classes (DateServerImpl_Stub.class and DateServerImpl_Skel.class) will be
			generated after the compilation.*/

}
