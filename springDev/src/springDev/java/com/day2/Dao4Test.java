package springDev.java.com.day2;

import java.util.Calendar;
import java.util.logging.Logger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dao4Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring-bean9.xml");
		Calendar object= (Calendar) context.getBean("cal");
		System.out.println(object);
		
		 /*If not using factory-mathod, java.lang.InstantiationException*/
		
	}

}
