package com.learn.oop.exception;

public class Eligible {

	public static void check(int exp)
	{
		if(exp<10)
			throw new ArithmeticException("Person is not eligible for Architect role");
		else
			System.out.println("Candidate is Eligible");
	}
	public static void main(String[] args)
	{
		check(9);
	}
}
