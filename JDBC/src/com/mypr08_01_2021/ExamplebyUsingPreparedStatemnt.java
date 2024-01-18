package com.mypr08_01_2021;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class ExamplebyUsingPreparedStatemnt {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myprepstatement", "root", "root");
			
			String sql="insert into student values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, sc.nextInt());
			ps.setString(2, sc.next());
			ps.setString(3, sc.next());
			ps.execute();
			String sql1="select * from student";
			PreparedStatement ps1=con.prepareStatement(sql1);
			ResultSet rs=ps1.executeQuery();
			while(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				
				String sql2="insert into studentdata values(?,?,?)";
				PreparedStatement ps2=con.prepareStatement(sql2);
				ps2.setInt(1, rs.getInt(1));
				ps2.setString(2, rs.getString(2));
				ps2.setString(3, rs.getString(3));
				ps2.execute();
			}
			System.out.println("done");
			String sql3="delete from student where rollno=66 ";
			PreparedStatement ps3=con.prepareStatement(sql3);
			ps.execute();
			System.out.println("done");
			
			String sql4="update student set name=? where name='Neha'";
			PreparedStatement ps4=con.prepareStatement(sql4);
			ps.setString(1, sc.next());
			ps.execute();
			System.out.println("done");
			
			
		
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
