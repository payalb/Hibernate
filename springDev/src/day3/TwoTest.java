package day3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TwoTest {
	public static void main(String args[]){
		Resource res= new ClassPathResource("resources3/spring-two.xml");
	BeanFactory context= new XmlBeanFactory(res);
	//context.registerShutdownHook();
	Two object= (Two) context.getBean("two");
	object.print();
	
}


}
