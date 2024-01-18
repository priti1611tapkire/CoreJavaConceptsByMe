package com.mtask1;


import java.sql.*;
//insert query
public class Airport_data2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airport", "root", "root");

		String sql="insert into airportdata values( 526, 'Reyansh', 'Delhi', '85955', '998568526')"; 
	
		Statement smt=con.createStatement();
		smt.execute(sql);
		
		System.out.println("data inserted successfully: "+sql);
		con.close();
	}
	
		
	

}
