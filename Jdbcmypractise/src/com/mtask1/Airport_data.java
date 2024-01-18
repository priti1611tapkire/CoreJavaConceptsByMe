package com.mtask1;
import java.sql.*;
/* */
public class Airport_data {
	public static void main(String[] args) throws ClassNotFoundException {
		//1) LOAD DRIVER CLASS
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//2) ESTABLISH CONNECTION
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airport", "root", "root");
		//3) query=insert into table valuse
			String sql="insert into airportdata values(650 ,'Yogita', 'Pune', '875682', '985885866')"; 
		// 4) CONTRUCT SATATEMENT OBJECT
			Statement smt=con.createStatement();
			
			//5)  submit sql query
			smt.execute(sql);
			System.out.println("data inserted successfully " +sql);
			// always check your connection must be close
			con.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		
	}

}
