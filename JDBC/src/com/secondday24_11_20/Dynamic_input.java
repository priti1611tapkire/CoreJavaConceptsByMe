package com.secondday24_11_20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Dynamic_input {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		
		/*int rollno=Integer.parseInt(args[0]);
		String name=args[1];
		String address=args[2];*/
		
		Scanner sc=new Scanner(System.in);
		/*System.out.println("Enter roll no: ");
		int rollno=sc.nextInt();
		System.out.println("Enter name: ");
		String name=sc.next();
		System.out.println("Enter Address: ");
		String address=sc.next();
		
		String sql="insert into studentdata values("+rollno+", '"+name+"','"+address+"')";*/
		
		System.out.println("delelte data of rollno: ");
		int rollno=sc.nextInt();
		
		
		String sql="delete from studentdata where rollno="+rollno+"";
		Statement smt=con.createStatement();
		System.out.println(sql);
		
		smt.execute(sql);
		smt.close();
		con.close();
		
	}

}
