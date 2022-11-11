package com.junit.testCases;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo {
	
//	@ValueSource
//	@EnumSource
//	@MethodSource
//	@CsvSource
//	@CsvFileSource
//	@ArgumentsSource
	
	
	
	@ParameterizedTest(name="{index} -Run with args = {0}")
	@ValueSource(ints= {1,3,5,7} )
	public void valueSourceTest(int args) {
		System.out.println(args);
	}
	
	//enum source
	enum TV{
		Sony,LG,Samsung;
	}
	
	@ParameterizedTest
	@EnumSource(TV.class)
	public void enumSourceTest(TV args) {
		System.out.println(args);
	}
	
	//method source
	public static String[] cars() {
		return new String[] {"Rolls Royce","Honda","Maruti"};
	}
	@ParameterizedTest
	@MethodSource("cars")
	public void methodSourceTest(String cars) {
		System.out.println(cars);
	}
	
	//----csv source
}
