package springDev.java.com.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepCheck1Test {
	public static void main(String args[]) throws ClassNotFoundException{

			ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring-bean2.xml");
			DepCheck1 object= (DepCheck1) context.getBean("depCheck1");
	
		
		}

}
