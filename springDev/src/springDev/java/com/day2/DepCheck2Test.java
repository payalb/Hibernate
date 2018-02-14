package springDev.java.com.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DepCheck2Test {
	public static void main(String args[]) throws ClassNotFoundException{

			ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring-bean3.xml");
			DepCheck2 object= (DepCheck2) context.getBean("depCheck2");
	
		
		}

}