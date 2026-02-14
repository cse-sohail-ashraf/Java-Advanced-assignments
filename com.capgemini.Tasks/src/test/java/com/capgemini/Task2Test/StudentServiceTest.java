package com.capgemini.Task2Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.Task2.Student;
import com.capgemini.Task2.StudentService;

public class StudentServiceTest {
	Student student;
	StudentService studentService;
	@BeforeEach
	public void setUp() {
		student = new Student(101,"sohail",80,80,80);
		studentService = new StudentService(student);
		
	}
	
	@Test
	public void isValidTotalMarks() {
		int total = studentService.totalMarks();
		assertEquals(240,total);
	}
	
	@Test
	public void isValidAverageMarks() { 
		assertEquals(80.00, studentService.averageMarks(),0.0);
	}

	@Test
	public void isValidisPassed() {
		assertEquals(true, studentService.isPassed());
	}
	
	
	@Test
	public void failedTestCase() {
		student = new Student(102, "legend suresh", 10, 20, 0);
        studentService = new StudentService(student);
		assertFalse(studentService.isPassed());
	}
}
