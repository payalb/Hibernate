package com.java.client;

import java.rmi.RemoteException;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.java.stateless.Calculator;

public class MyClient {
	
	
	public static void main(String[] args) throws NamingException, RemoteException {
		MyClient client= new MyClient();
		/*  Properties props = new Properties();
          props.put(Context.INITIAL_CONTEXT_FACTORY, "org.apache.openejb.client.RemoteInitialContextFactory");
          //props.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
           
          // glassfish default port value will be 3700, 
          // but im using tcpviewer to redirect my 50005 port to 3700
         // props.setProperty("org.omg.CORBA.ORBInitialPort", "3700");

       */   InitialContext context = new InitialContext();

       Calculator cart=  (Calculator) context.lookup("java:global/EJBDemo2EAR/EJBDemo2/CalculatorImpl!com.java.stateless.Calculator");
		System.out.println("In doget");
		cart.add(3, 4);}

	/*public static Context getInitialContext() throws NamingException {
		Properties properties = new Properties();
		properties.setProperty("java.naming.factory.initial",
				"com.sun.enterprise.naming.SerialInitContextFactory");
		properties.setProperty("java.naming.factory.url.pkgs",
				"com.sun.enterprise.naming");
		properties.setProperty("java.naming.provider.url",
				"remote://localhost:8080");
		InitialContext ctx = new InitialContext(properties);
		return ctx;

	}*/


}
