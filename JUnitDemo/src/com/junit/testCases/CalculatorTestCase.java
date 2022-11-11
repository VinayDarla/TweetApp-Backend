package com.junit.testCases;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import com.junit.demo.Calculator;

public class CalculatorTestCase {

	@Test
	@DisplayName("Adding 2 numbers")
	public void testAddMethod() {
		Calculator cal = new Calculator();
		int sum = cal.add(20, 45);
		assertEquals(-25, sum);
		System.out.println("Total is"+sum);
		
	}
	@Test
	@DisplayName("Subtracting 2 numbers")
	public void testSubMethod() {
		Calculator cal = new Calculator();
		int sum = cal.sub(20, 45);
		assertEquals(-25, sum);
		System.out.println("Total is"+sum);
		
	}
	@Test
	@DisplayName("Multiplying 2 numbers")
	public void testMultiplyMethod() {
		Calculator cal = new Calculator();
		int sum = cal.multiply(20, 45);
		assertEquals(900
				, sum);
		System.out.println("Total is"+sum);
		
	}

}
