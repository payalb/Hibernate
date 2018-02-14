package com.example.SpringCloud;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.java.spring.dao.ContactRepository;
import com.java.spring.dto.Contact;

@SpringBootApplication
@ComponentScan(basePackages={"com.java.spring"})
@Configuration
@EntityScan("com.java.spring.dto")
@EnableJpaRepositories("com.java.spring.dao")
public class SpringCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudApplication.class,args);
	}
	
	@Bean
	CommandLineRunner getRunner(ContactRepository repository){
		return args->{
			Arrays.asList("Payal Bansal, Ritu Sharma".split(","))
			.forEach(x->repository.save(new Contact(x, x)));
		};
	}
	
	
}
