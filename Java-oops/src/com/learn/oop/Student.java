package com.learn.oop;

public class Student {
int id;
String name;
Address address;
void insert(int id, String name, Address address)
{
	this.id= id;
	this.name = name;
	this.address =address;
}
void display()
{
	System.out.println(name+" "+address.city+" "+address.country);
}
public static void main(String[] args)
{
	Address ad = new Address("New Delhi","Haryana","India");
	Student s1=new Student();
	s1.insert(1, "Tom", ad);
	s1.display();
}
}
