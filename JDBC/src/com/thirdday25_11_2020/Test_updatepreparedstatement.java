package com.thirdday25_11_2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test_updatepreparedstatement {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
	
	String sql="update studenttable set name= ? where rollno=?";
	
	PreparedStatement ps=con.prepareStatement(sql);
	int rollno=96;
	String name="suyash";
	ps.setInt(1, rollno);
	ps.setString(2, "name");
/*	ps.setString(3, "Akurdi");*/
	ps.execute();
			
}
}
