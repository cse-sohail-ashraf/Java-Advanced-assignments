package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springbootdemo1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springbootdemo1Application.class, args);
		Car car = context.getBean(Car.class);
		System.out.println(car);
		car.run();
		Car car1 = context.getBean(Car.class);
		System.out.println(car1);
		car1.run();
		Vehicle vehicle1 = context.getBean(Bike.class);
		System.out.println(vehicle1);
		vehicle1.run();
		Vehicle vehicle2 = context.getBean(Bike.class);
		System.out.println(vehicle2);
		vehicle2.run();
		// Just check the car addresses and bike addresses 
		// Car both objects have same cuz @Scope is not given
	}

}
