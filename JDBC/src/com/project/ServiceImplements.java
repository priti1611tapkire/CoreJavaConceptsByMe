package com.project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ServiceImplements implements I{
	Scanner sc=new Scanner(System.in);
	public void addData() throws Exception{
		Connection con=MyConnection.getConnection();
		String sql="insert into student1 values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
//		System.out.println("Enter Roll No: ");
//		int rollno=sc.nextInt();
//		System.out.println("Enter Name: ");
//		String name=sc.next();
//		System.out.println("Enter Address: ");
//		String address=sc.next();
//		ps.setInt(1, rollno);
//		ps.setString(2, name);
//		ps.setString(3, address);
		ps.setInt(1, sc.nextInt());
		ps.setString(2, sc.next());
		ps.setString(3, sc.next());
		ps.execute();
		System.out.println(sql);
		System.out.println("-----------------ADDING OF DATA SUCCESSFULLY: "+sql);
	}

	public void retriveData() throws Exception{
		Connection con1=MyConnection.getConnection();
		String sql1="select * from student1";
		System.out.println(sql1);
		PreparedStatement ps1=con1.prepareStatement(sql1);
		ResultSet rs=ps1.executeQuery();
		while(rs.next()){
			System.out.println(rs.getInt(1));;	
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			ps1.execute();
			System.out.println("----xxxxx------");
		}
		System.out.println("--------------RETRIVEING OF DATA SUCCESSFULLY:  "+sql1);
	}


	public void deleteData() throws Exception{
		Connection con2=MyConnection.getConnection();
		System.out.println("Enter Roll no: ");
		int rollno1=sc.nextInt();
		String sql2="delete from student1 where rollno="+rollno1+"";
		System.out.println(sql2);
		PreparedStatement ps2=con2.prepareStatement(sql2);
		ps2.execute();
		System.out.println("-------------------DATA DELETED SUCCESSFULLY:  "+sql2);

	}


	public void updateData() throws Exception{
		Connection con3=MyConnection.getConnection();
		/*System.out.println("Enter Rollno: ");
		int rollno=sc.nextInt();*/
		System.out.println("Enter Student Name: ");
		String name=sc.next();
		/*System.out.println("Enter Student Address: ");
		String address=sc.next();*/
		String sql3="UPDATE student1 set name = ? where name = 'priti'";
		System.out.println(sql3);
		PreparedStatement ps3=con3.prepareStatement(sql3);
		ps3.setString(1, name);
		ps3.execute();
		System.out.println("--------DATA UPDATED SUCCESSFULLY: "+sql3);
	}
}
