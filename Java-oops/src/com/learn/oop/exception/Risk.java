package com.learn.oop.exception;
import java.io.IOException;

class Car{
	void breakDown()throws IOException{
		throw new IOException("Car is broken down man");
	}
}
public class Risk {
	
	public static void main(String[] args)
	{
		try {
			Car r =new Car();
			r.breakDown();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled"+e);
		}
		System.out.println("continue");
	}
}