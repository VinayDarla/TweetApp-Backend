package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.start.student.Student;
import com.start.student.StudentMeth;

public class Start {
public static void main(String[] args) throws IOException {
	System.out.println("Hello Universe");
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true)
	{
		System.out.println("press 1 to add a student ");
		System.out.println("press 2 to delete a student");
		System.out.println("press 3 to display a student ");
		System.out.println("press 4 to exit app ");
		int choice =Integer.parseInt(br.readLine());
		
		if(choice==1)
		{
			//add 
			System.out.println("Enter student's name");
			String name = br.readLine();
			System.out.println("Enter student's phone num");
			String num = br.readLine();
			
			System.out.println("Enter student's city");
			String city = br.readLine();
			
			Student st = new Student(name,num,city);
			System.out.println(st);
			
			//StudentMeth s1 = new StudentMeth();
			boolean status = StudentMeth.addStudentToDB(st);
			if(status)
				System.out.println("Student added successfully");
			else
				System.out.println("Error ocurred");
		}
		else if(choice==2)
		{
			//delete 
		}
		else if(choice==3)
		{
			//update
		}
		else if(choice==4)
		{
			//exit
		}
	}
}
}
