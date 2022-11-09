package com.learn.oop.Collections;
import java.util.LinkedList;
import java.util.Iterator;
public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> st =new LinkedList<>();
	st.add("Grapes");
	st.add("Apple");
	st.add("Orange");
	
	st.removeFirst();
	st.removeLast();
	
	Iterator<String> itr = st.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}
