package springDev.java.com.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepCheckTest {
	public static void main(String args[]) throws ClassNotFoundException{

			ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring-bean2.xml");
			DepCheck object= (DepCheck) context.getBean("depCheck");
	
		
		}

}
