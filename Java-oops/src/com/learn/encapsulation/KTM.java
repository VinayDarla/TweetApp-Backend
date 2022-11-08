package com.learn.encapsulation;

import com.learn.abstraction.DarlaEnp;

public class KTM {
	public static void main(String[] args)
	{
		//creating an object of encap class
		Bike duke = new Bike();

		duke.setName("KTM Duke 200CC");
		duke.setCC(200);
		duke.setColor("White & Red");
		duke.setPrice(189000);
		
		System.out.println(duke.getName());
		
	}
}
