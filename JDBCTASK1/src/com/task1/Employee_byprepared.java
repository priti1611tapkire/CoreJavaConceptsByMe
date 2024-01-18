package com.task1;


import java.sql.*;

/*Add the employee data into the database using prepared statement.
	Table name: employee
Variables:
int eid;
String ename;
double esalary;
lond emob;*/


public class Employee_byprepared {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		
		String sql="insert into employeetable values(?,?,?,?)";
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, 45);
		ps.setString(2, "neha");
		ps.setDouble(3, 250000);
		ps.setLong(4, 9458235868l);
		ps.execute();
		
	}

}
