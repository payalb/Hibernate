

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class MyTester {

	public static void main(String ags[]) throws NamingException {

		InitialContext context = (InitialContext) getInitialContext();
		ShoppingCart cart = (ShoppingCart) context
				.lookup("java:global/EJBProjectOneEAR/EJBProjectOne/ShoppingCartBean!org.jboss.tutorial.stateful.bean.ShoppingCart");
		System.out.println("In doget");
		cart.buy("soap", 12);
		cart.getCartContents();
	}

	public static Context getInitialContext() throws NamingException {
		Properties properties = new Properties();
		properties.setProperty("java.naming.factory.initial",
				"com.sun.enterprise.naming.SerialInitContextFactory");
		properties.setProperty("java.naming.factory.url.pkgs",
				"com.sun.enterprise.naming");
		properties.setProperty("java.naming.provider.url",
				"iiop://localhost:3700");
		InitialContext ctx = new InitialContext(properties);
		return ctx;

	}

}
