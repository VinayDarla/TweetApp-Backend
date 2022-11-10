package com.learn.oop.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Exercise {
public static void main(String[] args) {
	System.out.println("-------Using ArrayList-----");
	ArrayList<String> emp = new ArrayList<>();
	emp.add("Rahul");
	emp.add("Kishore");
	
	//remove last emp
	emp.remove(1);
	//add
	emp.add("Vinay");
	Iterator itr = emp.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
	System.out.println("after removing all");
	emp.removeAll(emp);
	Iterator itr1 = emp.iterator();
	while(itr1.hasNext())
		System.out.println(itr1.next());
}
}
