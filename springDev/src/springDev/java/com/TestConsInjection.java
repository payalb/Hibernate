package springDev.java.com;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestConsInjection {
	
	public static void main(String args[]) throws ClassNotFoundException{
	//Constructor Injection...
		ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring-bean.xml");
		ConstrInjection genedreObj= (ConstrInjection) context.getBean("constrInjectionObj");
		genedreObj.printName();		
	
	}

}
