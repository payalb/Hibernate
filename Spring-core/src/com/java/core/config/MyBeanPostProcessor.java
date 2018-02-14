package com.java.core.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{
	@Override
	public
	 Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("bean getting initialized"+ beanName);
			return bean;
		}
}
