/*package com.java;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

import com.java.model.Student;

@Configuration
public class Config {
	
	@Bean
	public HibernateTemplate getTemplate(){
		HibernateTemplate ht= new HibernateTemplate();
		ht.setSessionFactory(getSessionFactory());
		return ht;
	}
	
	@Bean 
	public SessionFactory getSessionFactory(){
		LocalSessionFactoryBean sf=new LocalSessionFactoryBean();
		sf.setAnnotatedClasses(Student.class);
		sf.setDataSource(ds);
		sf.setHibernateProperties(hibernateProperties);
		Properties prop= new Properties();
		return null;
		
	}
	<bean id="sf" class="org.springframework.orm.hibernate3.annotation.AnnotationSessionFactoryBean">
	<property name="dataSource" ref="ds"></property>
	<property name="hibernateProperties">
	<props>
	<prop key="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</prop>
	<prop key="hibernate.hbm2dd.auto">create</prop>
	<prop key="hibernate.show_sql">true</prop>
	</props>
	</property>
	<property name="annotatedClasses">
	<list>
	<value>com.java.model.Student</value>
	</list>
	</property>
	</bean>

	 <bean name="ht" class="org.springframework.orm.hibernate4.HibernateTemplate">
	 <property name="sessionFactory" ref="sf"/>
	 </bean>


}
*/