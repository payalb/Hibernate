package com.java.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.java.model.Student;

@Component
public class StudentInitializer implements CommandLineRunner{

	@Autowired
	StudentRepository repository;
	@Override
	public void run(String... args) throws Exception {

					Student st1= new Student("Payal", "");
					Student st2= new Student("Ritu", "");
					Student st3= new Student("Richa", "");
					Student st4= new Student("Shreya", "");
				repository.save(st1);
				repository.save(st2);
				repository.save(st3);
				repository.save(st4);
	
		
	}

}
