package com.jpa.text;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		ApplicationContext context
		= new ClassPathXmlApplicationContext(
			"beans.xml");

	// Getting the bean student
	Student student
		= context.getBean("student", Student.class);

	// Calling the method inside main() method
	student.cheating();
	}

}
