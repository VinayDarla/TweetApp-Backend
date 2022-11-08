package com.learn.oop.exception;

public class TestingFinally {
	public static void main(String[] args)
	{
		try {
			System.out.println("Inside try block");
			int num = 100/0;
			System.out.println(num);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("This block is executed regardless of exceptions");
		}
		System.out.println("continue");
	}
}
