package com.thirdday25_11_2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Student_dataexchangedb {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");


		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

		String sql="select * from studentdata";

		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){

			String sql1="insert into student1 values(?,?,?)";
			PreparedStatement ps1=con.prepareStatement(sql1);
			ps1.setInt(1, rs.getInt(1));
			ps1.setString(2, rs.getString(2));
			ps1.setString(3, rs.getString(3));
			ps1.execute();

		}
		System.out.println("Data inserted Successfully_______");
		con.close();
	}

}
