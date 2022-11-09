package com.learn.oop.Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<String> st =new LinkedHashSet<>();
		st.add("Jon Snow");
		st.add("Suresh");
		st.add("Vinay");
		st.add("Vinay");
		
		//st.remove("Suresh");
		
		Iterator<String> itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
