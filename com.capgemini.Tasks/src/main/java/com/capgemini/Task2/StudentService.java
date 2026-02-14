package com.capgemini.Task2;

public class StudentService {
	Student student;
	public StudentService(Student student) {
		this.student = student;
	}
	public int totalMarks() {
		return student.getMarks1()+student.getMarks2()+student.getMarks3();
	}
	
	public double averageMarks() {
		return totalMarks()/3;
	}
	
	public boolean isPassed() {
		return averageMarks() >= 40;
	}
}
