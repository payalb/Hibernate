package com.java.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.java.model.Teacher;

public class TestMain {

	public static void main(String args[])  {
		//Resource resource = new ClassPathResource("spring-bean1.xml");
		Resource resource = new ClassPathResource("spring-bean.xml");
		BeanFactory context = new XmlBeanFactory(resource);
		Teacher teacher = context.getBean("teacher", Teacher.class);
		//Teacher1 teacher = context.getBean("teacher", Teacher1.class);
		teacher.printDetails();
	}

}