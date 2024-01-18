package com.thirdday25_11_2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
	
	String sql="insert into studentdata values(?, ?, ?)";
	
	PreparedStatement ps=con.prepareStatement(sql);
	ps.setInt(1, 3);
	ps.setString(2, "xyz");
	ps.setString(3, "Akurdi");
	ps.execute();
			
}
}
