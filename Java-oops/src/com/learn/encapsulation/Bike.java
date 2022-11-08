package com.learn.encapsulation;

public class Bike {
private String name,color;
private int CC;
private int price;

public int getPrice() {
	return price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getCC() {
	return CC;
}
public void setCC(int cC) {
	CC = cC;
}
public void setPrice(int price) {
	this.price = price;
}


}
