package springDev.java.com.day2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring-bean5.xml");
		Car object= (Car) context.getBean("car");
		object.printData();
		Triangle tobject= (Triangle) context.getBean("triangle");
		tobject.print();
	}

}
