package com.mtask1;

import java.sql.*;
//create query
public class Airport_data1 {
	public static void main(String[] args) throws ClassNotFoundException {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airport",  "root", "root");
			
			String sql="update table airportdata1 SET(column_name1=1, passengername varchar(255), address varchar(255), adharno varchar(25), mob varchar(30)); ";
			
			Statement smt=con.createStatement();
			
			smt.execute(sql);
			
			System.out.println("table created successfully: "+sql);
			con.close();
			smt.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

}
