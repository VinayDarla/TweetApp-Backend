package com.learn.oop.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {

public static void main(String[] args) {
	ArrayList<String> students =new ArrayList<>();
	students.add("John");
	students.add("Hrithik");
	students.add("Venky");
	students.add("Jon Snow");
	
	System.out.println(students);
	Iterator el =students.iterator();
	while(el.hasNext())
		System.out.println(el.next());
	
	
}
}
