package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetrolEngine implements Engine{
	public PetrolEngine() {
		System.out.println("Petrol Engine created!");
	}
	
	
	public String getEngine() {
		return "Petrol Engine";
	}
}
