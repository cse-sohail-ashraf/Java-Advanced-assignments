package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements Engine{
	public DieselEngine() {
		System.out.println("Petrol Engine created!");
	}
	
	
	public String getEngine() {
		return "Petrol Engine";
	}
}
