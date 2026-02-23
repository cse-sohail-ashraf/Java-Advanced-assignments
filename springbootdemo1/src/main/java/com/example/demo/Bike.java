package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Bike implements Vehicle{
	public Bike() {
		System.out.println("Bike Bean Created");
	}

	@Override
	public void run() {
		System.out.println("Bike is running");
	}
}
