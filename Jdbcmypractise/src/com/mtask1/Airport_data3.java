package com.mtask1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
//delete query
public class Airport_data3 {
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airport", "root", "root");

			String sql="delete from airportdata where passengername='kunal'"; 
		
			Statement smt=con.createStatement();
			smt.execute(sql);
			
			System.out.println("data deleted successfully: "+sql);
			con.close();
		}

}
