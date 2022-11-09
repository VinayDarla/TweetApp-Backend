package com.start.student;

public class Student {
private int studentid;
private String studentName, phone,city;

public Student(int studentid, String studentName, String phone, String city) {
	super();
	this.studentid = studentid;
	this.studentName = studentName;
	this.phone = phone;
	this.city = city;
}

public Student(String studentName, String phone, String city) {
	super();
	this.studentName = studentName;
	this.phone = phone;
	this.city = city;
}

public Student() {
	super();
	
}

public int getStudentid() {
	return studentid;
}

public void setStudentid(int studentid) {
	this.studentid = studentid;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentName=" + studentName + ", phone=" + phone + ", city=" + city
			+ "]";
}



}
