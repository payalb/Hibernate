package springDev.java.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMainInjection {

	public static void main(String args[]) throws ClassNotFoundException {
		// Setter Injection...Not necessary to pass parameters to all setters.
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"resources/spring-bean.xml");
		HelloGender genedreObj = (HelloGender) context.getBean("helloGender");
		genedreObj.hello("Shweta");

	}

}
