package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootdemo2Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springbootdemo2Application.class, args);
		Car c1 = context.getBean(Car.class);
		c1.drive();
	}

}
