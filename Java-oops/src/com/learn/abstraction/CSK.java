package com.learn.abstraction;

public class CSK extends IPL {

	
	void play() {
		System.out.println("CSK is a consistent team");
		
	}
	public static void main(String[] args)
	{
		CSK obj = new CSK();
		obj.play();
	}
}
