package com.learn.oop.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
public static void main(String[] args) {
	//PriorityQueue<String> pq = new PriorityQueue<>();
	//pq.add("Rolls Royce");
	//pq.add("Mercedes");
	//pq.add("Ferrari");
	
	//System.out.println("Top element is "+pq.peek());
	//Iterator<String> itr = pq.iterator();
	//while(itr.hasNext())
	//{
	//	System.out.println(itr.next());
	//}
	
	PriorityQueue<String> emp = new PriorityQueue<>();
	System.out.println("------Using Queue-----");
	emp.add("Rahul");
	emp.add("Kishore");
	
	//remove 1st element (queue stores in ascending order)
	emp.remove();
	//adding employee
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
