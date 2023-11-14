package com.SpringBootCore.SpringBootCoreDemo.Core;

import com.SpringBootCore.SpringBootCoreDemo.Other.man;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//Cách 1 : dùng scanBasePackages để quyết định quét từ package nào
@SpringBootApplication //(scanBasePackages = "com.SpringBootCore.SpringBootCoreDemo.*")
//Cách 2 : ComponentScan : đánh dấu application có thể quét để lay bean từ pack không cùng cấp
@ComponentScan("com.SpringBootCore.SpringBootCoreDemo.*")
public class SpringBootCoreDemoApplication {

	public static void main(String[] args) {


		ApplicationContext context = SpringApplication.run(SpringBootCoreDemoApplication.class, args);

		human human =context.getBean(human.class);
		System.out.println(human);

		man newMan = context.getBean(man.class);
		System.out.println(newMan);
	}
}
