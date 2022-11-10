package com.junit.testCases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.demo.Calculator;

public class BeforeAndAfterTest {
	Calculator cal;
	@BeforeEach
	public void init() {
		cal = new Calculator();
		System.out.println("Before each method is called");
	}
	
	@AfterEach
	public void after()
	{
		System.out.println("After each method called");
	}
	
	@Test
	@DisplayName("Adding 2 numbers")
	public void testAddMethod() {
		
		int sum = cal.add(20, 45);
		assertEquals(65, sum);
		System.out.println("Total is"+sum);
		
	}
	@Test
	@DisplayName("Subtracting 2 numbers")
	public void testSubMethod() {
		
		int sum = cal.sub(20, 45);
		assertEquals(-25, sum);
		System.out.println("Total is"+sum);
		
	}
	@Test
	@DisplayName("Multiplying 2 numbers")
	public void testMultiplyMethod() {
	
		int sum = cal.multiply(20, 45);
		assertEquals(900, sum);
		System.out.println("Total is"+sum);
		
	}
}
