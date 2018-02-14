package org.jboss.tutorial.stateful.bean;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp){
	
			InitialContext context;
			try {
				context = (InitialContext) getInitialContext();
			
			ShoppingCart cart= (ShoppingCart) context.lookup("java:global/ExampleSessionBean/ShoppingCartBean!org.jboss.tutorial.stateful.bean.ShoppingCart");
			System.out.println("In doget");
		cart.buy("soap", 12);
		cart.getCartContents();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public static Context getInitialContext() throws NamingException{
		Properties properties= new Properties();
		properties.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
		properties.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
		properties.setProperty("java.naming.provider.url", "iiop://localhost:3700");
		InitialContext ctx= new InitialContext(properties);
		return ctx;
		
	}

}
