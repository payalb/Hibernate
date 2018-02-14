package com.java.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.java.model.Teacher2;

public class TestMain2 {

	public static void main(String args[])  {
		//Resource resource = new ClassPathResource("spring-bean1.xml");
		Resource resource = new ClassPathResource("spring-bean3.xml");
		BeanFactory context = new XmlBeanFactory(resource);
		Teacher2 teacher1 = context.getBean("teacher", Teacher2.class);
		Teacher2 teacher2 =context.getBean("teacher", Teacher2.class);
		//Teacher1 teacher = context.getBean("teacher", Teacher1.class);
		System.out.println("Object retrieved");
		teacher1.printDetails();
	}

}