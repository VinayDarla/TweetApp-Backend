package com.start.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentMeth {

	public static boolean addStudentToDB(Student st) 
	{
		boolean status = false;
		
		try {
			Connection con = SqlConnection.createConnection();
			String query1 = "insert into student_data(sname,sphone,scity)"+" values (?,?,?)";
			
			PreparedStatement stmt = con.prepareStatement(query1);
			
			//setting values
			stmt.setString(1, st.getStudentName());
			stmt.setString(2, st.getPhone());
			stmt.setString(3, st.getCity());
			
			//executing query
			stmt.executeUpdate();
			status =true;
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
		
	return status;	
	}
	
	public static boolean deleteStudent(int studentID) 
	{
		boolean status = false;
		
		try {
			Connection con = SqlConnection.createConnection();
			String query1 = "delete from student_data where sid=?";
			
			PreparedStatement stmt = con.prepareStatement(query1);
			
			//setting values
			stmt.setInt(1,studentID );
			
			
			//executing query
			stmt.executeUpdate();
			status =true;
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
		
	return status;	
	}

	public static boolean getAllStudents() 
	{
		boolean status = false;
		
		try {
			Connection con = SqlConnection.createConnection();
			String query1 = "select * from student_data";
			
			PreparedStatement stmt = con.prepareStatement(query1);
			
			//executing query
			ResultSet set = stmt.executeQuery();
			while(set.next())
			{
				int id = set.getInt("sid");
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);
				System.out.println("ID " +id+" name "+name+" city "+city);
				
			}
			
			status =true;
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
		
	return status;	
	}
}
