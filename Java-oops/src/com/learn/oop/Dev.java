package com.learn.oop;

class Employee {
int baseSalary = 50000;
//method overloading
void totalSalary(int bS, int bonus) {
	System.out.println(bS+bonus);
}

void totalSalary(int bS, int bonus,int incentive) {
	System.out.println(bS+bonus+incentive);
}

void Working()
{
	System.out.println("Employee is working");
}
}

//class Dev extends Employee{
//	int bonus = 20000;
//	int total = bonus + baseSalary;
//	public static void main(String[] args)
//	{
//		Dev emp = new Dev();
//		System.out.println("Total salary is"+ emp.total);
//	}
//}