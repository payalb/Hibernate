package springDev.java.com.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepCheck3Test {
	public static void main(String args[]) throws ClassNotFoundException{

		ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring-bean4.xml");
		DepCheck3 object= (DepCheck3) context.getBean("depCheck3");
		System.out.println(object.getName());
		System.out.println(object.getTriangle());

	
	}

}
