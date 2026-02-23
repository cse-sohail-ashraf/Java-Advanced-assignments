package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class SMSNotification implements Notification{
	public SMSNotification() {
		System.out.println("Email Notification Bean Created!");
	}
	void send(String message) {
		
	}
}
