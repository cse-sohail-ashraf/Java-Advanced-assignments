package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Bike {
	public Bike() {
		System.out.println("Bike Bean Created!");
	}
	void run() {
		System.out.println("Bike is running!");
	}
}
