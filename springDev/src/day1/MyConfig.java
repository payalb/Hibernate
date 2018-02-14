package day1;

import org.springframework.beans.factory.annotation.RequiredAnnotationBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="day1")
public class MyConfig {
	@Bean
	public RequiredAnnotationBeanPostProcessor getProcessor() {
		return new RequiredAnnotationBeanPostProcessor();
	}
	//Singleton
	@Bean(name="repository")
	public Repository1 getRepository() {
		return new MyRepository();
	}
	
	@Bean(name="service1")
	public MyService getService() {
		MyService obj= new MyService();
	//	obj.setRep(getRepository());
		return obj;
	}
	
	
	
	/*@Bean
	public AutowiredAnnotationBeanPostProcessor getProc() {
		return new AutowiredAnnotationBeanPostProcessor();
	}
	*/
	
	/*<context:annotation-driven>*/
}

//Setter injection , constructor injection


