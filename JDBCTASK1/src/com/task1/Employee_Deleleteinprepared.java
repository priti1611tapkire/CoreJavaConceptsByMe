package com.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee_Deleleteinprepared {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		int Eid=Integer.parseInt(args[0]);
		String sql="Delete from employeetable where (eid=?)";
		
		
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, Eid);
		ps.execute();
		
		
		System.out.println("sucssesfully deleted----------");
		ps.close();
		con.close();
		
	
}
}
