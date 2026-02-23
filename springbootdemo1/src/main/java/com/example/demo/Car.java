package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	public Car() {
		System.out.println("Car Bean Created");
	}

	@Override
	public void run() {
		System.out.println("Car is running");
	}
	
}
