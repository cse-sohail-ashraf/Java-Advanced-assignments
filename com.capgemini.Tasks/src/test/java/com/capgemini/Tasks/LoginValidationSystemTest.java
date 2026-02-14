package com.capgemini.Tasks;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvFileSources;

import com.capgemini.Task1.LoginValidationSystem;

public class LoginValidationSystemTest {
	private LoginValidationSystem test;
	
	@BeforeEach
	void create() {
		test = new LoginValidationSystem();
	}
	
	@Test
	void testUserName() {
		assertTrue(test.checkUserName("sohailrcom"));
		assertFalse(test.checkUserName("sohi"));
	}
	
	@Test
	void testPassword() {
		assertTrue(test.checkUserPassword("$Ohail123"));
		assertFalse(test.checkUserPassword("Ohail123"));
		assertTrue(test.checkUserPassword("Ohail$123"));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/login-data.csv",numLinesToSkip = 1)
	@DisplayName("Test Cases using CSV File")
	void testValidUserNameUsingCsvFile(String userName,String password) {
		assertTrue(test.checkUserName(userName));
		assertTrue(test.checkUserPassword(password));
	}
}
