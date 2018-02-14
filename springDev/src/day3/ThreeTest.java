package day3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThreeTest {
	public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
	AbstractApplicationContext context= new ClassPathXmlApplicationContext("resources3/spring-three.xml");
	context.registerShutdownHook();
	Three object1= (Three) context.getBean("three");
	//Three object= (Three) context.getBean("three");
	/*System.out.println(object.getInstance());
	System.out.println(object.getInstance());
	System.out.println(object);
	System.out.println(object1);*/
	//object.print();
}


}
