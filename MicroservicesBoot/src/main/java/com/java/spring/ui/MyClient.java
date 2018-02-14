package com.java.spring.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.java.spring"})
@EntityScan("com.java.spring.dto")
@EnableJpaRepositories("com.java.spring.dao")
public class MyClient {

	public static void main(String[] args) {
		SpringApplication.run(MyClient.class, args);

	}

}
