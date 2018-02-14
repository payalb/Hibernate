package springDev.java.com;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class TestMain {
	
	private  Shape shape;

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public void drawShape() {
		shape.draw();

	}
	
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		//Find xml class. Lazy container.
	//	Resource rs= new ClassPathResource("resources/spring-bean.xml");
		//Load xml file
	//	BeanFactory factory= new XmlBeanFactory(rs);
		//Create object while loading xml file for singleton scope.. Eager container.
		ApplicationContext context= new ClassPathXmlApplicationContext("resources/spring-bean.xml");
		Shape shape= (Shape)context.getBean("shape1");
		//Create class object, typecast Object to class type. Calls constructor.
		Shape shape1= (Shape) context.getBean("shape1");
		Shape shape2= (Shape) context.getBean("shape1");
		System.out.println(shape1== shape2);
		shape.draw();
		
		shape1.draw();
		//Instantiation for private Constructor class...
	/*	Class testObj= Class.forName("springDev.java.com.Test1");
		for(Constructor cons: testObj.getDeclaredConstructors()){
			cons.setAccessible(true);
			Test1 obj= (Test1) cons.newInstance();
		}*/
	}

}

 class Test1{
	private Test1(){
		
	}
}
