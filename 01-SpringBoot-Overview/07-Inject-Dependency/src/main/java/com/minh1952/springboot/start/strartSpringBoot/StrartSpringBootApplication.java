package com.minh1952.springboot.start.strartSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrartSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(StrartSpringBootApplication.class, args);

		Vehicle car = new Car();
		Vehicle bicycle = new bicycle();
		Vehicle motoBike = new MotoBike();

		//inject bằng Constructor
		User Minh = new User(car);
		Minh.showVehicle();

		//inject bằng setter
		Minh.setVehicle(bicycle);
		Minh.showVehicle();

	}

}
