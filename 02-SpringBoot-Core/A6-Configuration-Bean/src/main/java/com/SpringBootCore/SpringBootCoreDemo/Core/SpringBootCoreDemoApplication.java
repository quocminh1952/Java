package com.SpringBootCore.SpringBootCoreDemo.Core;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//Cách 1 : dùng scanBasePackages để quyết định quét từ package nào
@SpringBootApplication //(scanBasePackages = "com.SpringBootCore.SpringBootCoreDemo.*")


public class SpringBootCoreDemoApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(SpringBootCoreDemoApplication.class, args);
		System.out.println(context.getBean(human.class));
	}
}
