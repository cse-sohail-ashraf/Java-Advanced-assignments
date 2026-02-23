package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootdemo3Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springbootdemo3Application.class, args);
		EmailNotification emailBean = context.getBean(EmailNotification.class);
	}

}
