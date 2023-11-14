package com.SpringBootCore.SpringBootCoreDemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCoreDemoApplication {

	public static void main(String[] args) {
        //1:  Khởi chạy tìm các lớp có đánh dấu là bean va them vào container
		// mỗi bean chỉ được tạo 1 lần duy nhất (trừ khi sử dụng @scope("proprerty")
		ApplicationContext context = SpringApplication.run(SpringBootCoreDemoApplication.class, args);
		//2:  tìm đến bean Tshirt
		Outfit outfit = (Outfit) context.getBean("Tshirt");
		System.out.println(outfit);

		//tìm đến bean human ..lúc này đã được inject bean Tshirt
		human human = context.getBean(human.class);
		System.out.println(human.getOutfit().wear());
	}
}
