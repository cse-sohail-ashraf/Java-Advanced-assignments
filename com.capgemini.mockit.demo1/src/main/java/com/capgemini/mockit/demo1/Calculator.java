package com.capgemini.mockit.demo1;

public class Calculator {
	private MathService mathService;
	
	
	public Calculator(MathService mathService) {
		this.mathService = mathService;
	}
	
	public int add(int a, int b) {
		return mathService.add(a, b);
	}
}