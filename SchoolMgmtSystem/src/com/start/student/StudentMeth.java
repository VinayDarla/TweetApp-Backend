package com.start.student;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
