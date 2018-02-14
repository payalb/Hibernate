package org.jboss.tutorial.stateful.bean;

import java.util.Properties;

import javax.ejb.EJB;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MyTester {
	@EJB
	ShoppingCart cart;

	public static void main(String ags[]) throws NamingException {

		MyTester tester= new MyTester();
		InitialContext context = (InitialContext) tester.getInitialContext();
		tester.cart = (ShoppingCart) context
				.lookup("java:global/ejb/Cart#org.jboss.tutorial.stateful.bean.ShoppingCart");
		System.out.println("In doget");
		tester.cart.buy("soap", 12);
		tester.cart.getCartContents();
	}

	public  Context getInitialContext() throws NamingException {
		Properties properties = new Properties();
		/*Properties properties = new Properties();
		properties.setProperty("java.naming.factory.initial",
				"com.sun.enterprise.naming.SerialInitContextFactory");
		properties.setProperty("java.naming.factory.url.pkgs",
				"com.sun.enterprise.naming");*/
	/*	properties.setProperty("java.naming.provider.
	 * url",
				"remote://localhost:8080");*/
		/*properties.setProperty("com.sun.CORBA.connection.ORBSocketFactory", "com.sun.enterprise.iiop.IIOPSSLSocketFactory"); 
		properties.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
		 // glassfish default port value will be 3700,
		properties.setProperty("org.omg.CORBA.ORBInitialPort", "3700");*/
		properties.put(Context.INITIAL_CONTEXT_FACTORY,
				  "com.sun.enterprise.naming.SerialInitContextFactory");
		properties.setProperty("java.naming.factory.url.pkgs",
				"com.sun.enterprise.naming");
		properties.put(Context.PROVIDER_URL,
				  "iiop://localhost:3700");

		InitialContext ctx = new InitialContext(properties);
		return ctx;

	}

}
