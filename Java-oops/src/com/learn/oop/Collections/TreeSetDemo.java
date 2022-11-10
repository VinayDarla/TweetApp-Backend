package com.learn.oop.Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
public static void main(String[] args) {
	TreeSet<String> brands = new TreeSet<>();
	
	brands.add("Puma");
	brands.add("Nike");
	brands.add("Sony");
	brands.add("Puma");
	brands.add("Apple");
	
	//Iterator itr = brands.iterator();
	//elements in descending order
	Iterator itr = brands.descendingIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
}
}
