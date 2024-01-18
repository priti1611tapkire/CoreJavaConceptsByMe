package com.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee_updateprepared {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		Class.forName("com.mysql.jdbc.Driver");
		
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			Scanner sc=new Scanner(System.in);
			System.out.println("enter Eid: ");
			int eid=sc.nextInt();
			System.out.println("enter Ename: ");
			String ename=sc.next();
			System.out.println("enter salary: ");
			Double esalary=sc.nextDouble();
			System.out.println("entry emob: ");
			Long emob=sc.nextLong();
			
			String sql=(" UPDATE employeetable SET name=?, salary=?, WHERE eid=?");
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setString(1, ename);
			ps.setDouble(2, esalary);
			ps.setInt(3, eid);
			
			System.out.println("Data updated Successfully"+sql);
		
		
			
			con.close();
	}
}
