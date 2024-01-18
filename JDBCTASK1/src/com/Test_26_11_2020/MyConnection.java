package com.Test_26_11_2020;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
	public static Connection getConnection() throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
	return con;
	
	}

}
