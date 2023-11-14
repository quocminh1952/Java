package com.SpringBootCore.SpringBootCoreDemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootCoreDemoApplication {

	public static void main(String[] args) {

		System.out.println("Create bean human and manage : ");
		ApplicationContext context = SpringApplication.run(SpringBootCoreDemoApplication.class, args);
		human human = context.getBean(human.class);
		System.out.println("delete bean human :");
		((ConfigurableApplicationContext)context).getBeanFactory().destroyBean(human);

	}
}
