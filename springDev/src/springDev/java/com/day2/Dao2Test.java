package springDev.java.com.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dao2Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring-bean7.xml");
		Dao2 object= (Dao2) context.getBean(Dao2.class);
		object.printData();
	
	}

}
