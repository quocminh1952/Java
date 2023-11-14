package com.SpringBootCore.SpringBootCoreDemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCoreDemoApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(SpringBootCoreDemoApplication.class, args);
		studentService studentService = context.getBean(com.SpringBootCore.SpringBootCoreDemo.studentService.class);
		Student student = studentService.getStudentByIdToUpperCase("S1");
		System.out.println(student);

	}
}
