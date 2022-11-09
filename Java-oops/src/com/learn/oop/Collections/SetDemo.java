package com.learn.oop.Collections;

import java.util.Iterator;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<String> st =new HashSet<>();
		st.add("Jon Snow");
		st.add("Suresh");
		st.add("Vinay");
		
		st.remove("Suresh");
		
		Iterator<String> itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
