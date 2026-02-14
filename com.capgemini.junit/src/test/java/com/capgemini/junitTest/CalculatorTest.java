/**
 * 
 */
package com.capgemini.junitTest;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.capgemini.junit.Calculator;

/**
 * 
 */
public class CalculatorTest {
	private Calculator calculator;
	
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	@DisplayName("Test of two positive number")
	public void testTwoAndTwoGivesFour() {
		assertEquals(4,calculator.add(2,2));
	}
	@Test
	public void testFiveAndFourGivesNine() {
		assertEquals(9,calculator.add(5, 4));
	}
	
	@RepeatedTest(3)
	@DisplayName("Test sum with repeated execution")
	void testSumRepeated() {
		assertEquals(10,calculator.add(5, 5),"Sum of 5 and 5 gives 10");
	}
	
	@Nested
	@DisplayName("Subtraction Tests")
	class SubtractionTests{
		
		@Test
		@DisplayName("Test Subtraction of two numbers")
		void testFiveandFourGivesOne() {
			assertEquals(1,calculator.subtract(5,4), "5 - 4 should give 1");
		}
		
		@Test
		void testOneAndOneGivesZero() {
			assertEquals(0,calculator.subtract(1,1), "1 -1 should give 1");
		}
	}
	
	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4,5,6})
	@DisplayName("Test multiplication of numbers by 2")
	void testMultiplyByTwo(int number) {
		assertEquals(number * 2, calculator.multiply(number,2),"Multiplication of two numbers");
	}
	
	@ParameterizedTest
	@CsvSource({"2,2,4","2,3,6","4,4,16"})
	void testMultiply(int x,int y,int expected) {
		assertEquals(expected, calculator.multiply(x,y));
	}
	
	@ParameterizedTest
	@CsvFileSource(resources = "/calculator-data.csv",numLinesToSkip = 1)
	@DisplayName("Test Multiply using CSV file")
	void testSumUsingCsvFile(int a,int b,int expectedSum) {
		assertEquals(expectedSum, calculator.multiply(a, b));
	}
	
	@Test
	@DisplayName("Test division by zero")
	void testDivideyZero() {
		assertThrows(IllegalArgumentException.class, () -> calculator.divison(2,0));
	}
}
