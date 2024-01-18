package com.task26_11_2020;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test_byusingprepared {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.jdbc.Driver");

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		while(true){
			System.out.println("Enter 1 for insert query");
			System.out.println("Enter 2 for select query");
			System.out.println("Enter 3 for delete query");
			System.out.println("Enter 4 for update query");
			System.out.println("Enter 5 for exit");
			int ch=sc.nextInt();

			switch (ch){
			case 1:
				System.out.println("Enter roll no:  ");
				int rollno=sc.nextInt();
				System.out.println("Enter name:   ");
				String name=sc.next();
				System.out.println("Enter Address: ");
				String address=sc.next();
				String sql="insert into studentdata values(?,?,?)";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setInt(1, rollno);
				ps.setString(2, name);
				ps.setString(3, address);
				ps.execute();
				System.out.println(sql);
				System.out.println("-----------------ADDING OF DATA SUCCESSFULLY: "+sql);
				break ;
				

			case 2: 
				String sql1="select * from studentdata";
				System.out.println(sql1);
				PreparedStatement ps1=con.prepareStatement(sql1);
				ResultSet rs=ps1.executeQuery();
				while(rs.next()){
					System.out.println(rs.getInt(1));;	
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					ps1.execute();
					System.out.println("----xxxxx------");
				}
				System.out.println("--------------RETRIVEING OF DATA SUCCESSFULLY:  "+sql1);
				break ;
				

			case 3: 
				System.out.println("Enter Roll no: ");
				int rollno1=sc.nextInt();
				String sql2="delete from studentdata where rollno="+rollno1+"";
				System.out.println(sql2);
				PreparedStatement ps2=con.prepareStatement(sql2);
				ps2.execute();
				System.out.println("-------------------DATA DELETED SUCCESSFULLY:  "+sql2);
				break ;
				

			case 4:
				System.out.println("Enter Student Name: ");
				String name3=sc.next();
				String sql3="UPDATE studentdata set name = ? where  Name='+name3+'";
				System.out.println(sql3);
				PreparedStatement ps3=con.prepareStatement(sql3);
				ps3.setString(1,  name3);
				ps3.execute();
				System.out.println("--------DATA UPDATED SUCCESSFULLY: "+sql3);
				break ;

			case 5:
				System.exit(0);

			default :
				System.out.println(" invalid input--------");
			}
		}
	}
}
