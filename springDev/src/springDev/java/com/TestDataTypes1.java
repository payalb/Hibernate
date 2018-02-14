package springDev.java.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDataTypes1 {
	public static void main(String args[]) throws ClassNotFoundException {
		// Diff dataTypes, inner beans, reference to beans.
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"resources/spring-bean-1.xml");
		DataTypes dataTypeObj = (DataTypes) context.getBean("dataTypeObj");
		dataTypeObj.hello1("Shweta");

	}
}
