package com.task26_11_2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test {
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
				String sql="insert into student1 values (RollNo="+rollno+", Name='"+name+"', Address='"+address+"')";				
				Statement smt=con.createStatement();
				smt.execute(sql);
				System.out.println("---------------DATA INSERTED SUCCESSFULLY: "+sql);
				break;

			case 2:
				String sql4="select * from student1";
				Statement smt4=con.createStatement();
				ResultSet rs=smt4.executeQuery(sql4);
				System.out.println("Data display----------");
				while(rs.next()){
					System.out.println(rs.getInt(1));
					System.out.println(rs.getString(2));
					System.out.println(rs.getString(3));
					System.out.println("-------xxxxxxxxxxxxxxxxxxxxxxx---------");
				}
				System.out.println("---------------------------------------------------------");
				break;

			case 3:
				System.out.println("DELETE DATA OF ROLL NO:  ");
				int rollno1=sc.nextInt();
				String sql2="Delete from student1 where rollno="+rollno1+"";
				Statement smt2=con.createStatement();
				smt2.execute(sql2);
				System.out.println("-------------DATA DELETED SUCCESSFULLY: "+sql2);
				break;


			case 4:
				System.out.println("Enter Roll No:   ");
				int rollno2=sc.nextInt();
				System.out.println("Enter Student Name:  ");
				String name1=sc.next();
				System.out.println("Enter Student Address: ");
				String address1=sc.next();
				String sql1="UPDATE student1 SET Name='"+name1+"' , Address='"+address1+"' WHERE Rollno="+rollno2+"";
				Statement smt1=con.createStatement();
				smt1.execute(sql1);
				System.out.println("---------------DATA UPDATED SUCCESSFULLY: "+sql1);
				break;

			case 5:
				System.exit(0);

			default :
				System.out.println(" invalid input--------");
			}

		}


	}

}
