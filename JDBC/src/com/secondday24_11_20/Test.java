package com.secondday24_11_20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.ResultSet;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:MySql://localhost:3306/test", "root", "root");
		
				String sql="select * from studentdata";
				//String sql="delete from student where name='SIDDHARTH';";
		Statement smt=con.createStatement();
		
		ResultSet rs= smt.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
		}	
	}
}
