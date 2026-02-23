package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailNotification implements Notification{
	public EmailNotification() {
		System.out.println("Email Notification Bean Created!");
	}
	
	
	void send(String message) {
		
	}
}
