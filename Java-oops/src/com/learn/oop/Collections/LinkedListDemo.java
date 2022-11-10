package com.learn.oop.Collections;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListDemo {
public static void main(String[] args) {
	//LinkedList<String> st =new LinkedList<>();
	//st.add("Grapes");
	//st.add("Apple");
	//st.add("Orange");
	
	//st.removeFirst();
	//st.removeLast();
	
	//Iterator<String> itr = st.iterator();
	//while(itr.hasNext()) {
	//	System.out.println(itr.next());
	//}
	
	LinkedList<String> emp =new LinkedList<>();
	System.out.println("-------Using LinkedList-----");
	emp.add("Rahul");
	emp.add("Darla");
	
	//remove 1st element
	emp.remove();
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
