package com.task;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{ 
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		for(int i=0;i<4;i++){ 	
			Student stu=new Student();
			System.out.println("Enter Roll no: ");
			int a=sc.nextInt();
			stu.setRollno(a);
			System.out.println("Enter Student Name: ");
			String b=sc.next();
			stu.setName(b);
			System.out.println("Enter Address:  ");
			String c=sc.next();
			stu.setAddr(c);
			String sql="insert into studentdata values( ?,?,?)"; 

			PreparedStatement ps=con.prepareStatement(sql);

		
				ps.setInt(1, stu.getRollno());
				ps.setString(2, stu.getName());	
				ps.setString(3, stu.getAddr());
				ps.execute();
				System.out.println(sql);
				//Set all Student data here(use keyboard input for student data)and add into the database using prepared statement. 	

			
		}
		System.out.println("Data inserted successfully:  ");
		con.close();
	}    

}
