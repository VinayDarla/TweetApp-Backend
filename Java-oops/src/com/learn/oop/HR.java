package com.learn.oop;

public class HR extends Employee {
int bonus =28493;
int incentive;
void Working()
{
	System.out.println("Employee is working as Full Staack Developer");
}
public static void main(String[] args)
{
	HR Vinay = new HR();
	Vinay.totalSalary(Vinay.baseSalary,Vinay.bonus);
	
	HR Venky = new HR();
	Venky.incentive = 16630;
	Venky.totalSalary(Venky.baseSalary, Venky.bonus, Venky.incentive);
	Venky.Working();
	
	
}
}
