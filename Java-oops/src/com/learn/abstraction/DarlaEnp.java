package com.learn.abstraction;

public class DarlaEnp implements ITCompanies {
public void Working()
{
	System.out.println("DarlaEnp is one of the top companies in the world");
}
public static void main(String[] args)
{
	DarlaEnp obj = new DarlaEnp();
	obj.Working();
}
}
