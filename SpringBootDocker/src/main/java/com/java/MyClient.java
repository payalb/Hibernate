package com.java;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.java.model.Student;
import com.java.repository.StudentRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= StudentRepository.class)
@EntityScan(basePackageClasses=Student.class)
public class MyClient {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(MyClient.class, args);
	}
}




