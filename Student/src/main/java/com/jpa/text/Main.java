package com.jpa.text;




import java.io.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/jpa/text/fconfig.xml");
				
		Student student= (Student)context.getBean("stud");
		System.out.println(student);
	}
}
