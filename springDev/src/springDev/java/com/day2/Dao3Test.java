package springDev.java.com.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dao3Test {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring-bean8.xml");
		/*Dao3.hello();*/
		Dao3 e1=(Dao3) context.getBean(Dao3.class);
		System.out.println(e1.getE().getModelYear());
	}

}
