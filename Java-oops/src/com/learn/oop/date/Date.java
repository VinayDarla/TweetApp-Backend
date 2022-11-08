package com.learn.oop.date;

import java.time.LocalDate;

public class Date {
public static void main(String[] args) {
	LocalDate today = LocalDate.now();
	LocalDate yesterday = today.minusDays(1);
	LocalDate tomorrow = today.plusDays(1);
	
	System.out.println("Today's date is"+today);
	System.out.println("Yesterday's date is"+yesterday);
	System.out.println("Tomorrow's date is"+tomorrow);
	
}
}
