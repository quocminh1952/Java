package com.SpringBootCore.SpringBootCoreDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootCoreDemoApplication {

	public static void main(String[] args) {
        //1:  Khởi chạy tìm các lớp có đánh dấu là bean va them vào container
		// mỗi bean chỉ được tạo 1 lần duy nhất (trừ khi sử dụng @scope("proprerty")
		ApplicationContext context = SpringApplication.run(SpringBootCoreDemoApplication.class, args);
		//2:  tìm đến bean human và trả về:
		human human =context.getBean(human.class);
		System.out.println(human);
		// sau khi tìm thấy bean Coat thì auto inject vào human
		System.out.println(human.getOutfit().wear());
	}
}
