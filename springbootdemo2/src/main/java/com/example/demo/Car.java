package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Car {
	private Engine engine;
	
	@Autowired
	public Car(Engine engine) {  //Constructor Engine
		this.engine = engine;
		System.out.println("Car Bean Created by Spring!");
	}
	
	public void drive() {
		System.out.println("Driving car using " + engine.getEngine());
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Car bean initialized");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Car Bean Destroyed");
	}
}
