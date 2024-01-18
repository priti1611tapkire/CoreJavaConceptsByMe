package com.mypr08_01_2021;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
// by using statement
public class Example {
	public static void main(String[] args) throws ClassNotFoundException {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbcpr", "root", "root");
			
//			String sql="create table student (rollno int, name varchar(255), address varchar(255), age int)";
//			String sql="insert into student values(1,'Sidhharth','Banglore', 26)";
//			String sql="insert into student values(1,'Sidhharth','Banglore', 26)";
//			String sql1="insert into student values(2,'Mahesh','Pune', 28)";
//			String sql2="insert into student values(3,'Yash','Abad', 29)";
//			String sql="delete from student where name='Yash';";
			String sql="update student set name='Sid' where name='Mahesh'";
			
			Statement smt=con.createStatement();
			smt.execute(sql);
//			smt.execute(sql1);
//			smt.execute(sql2);
			System.out.println("done");
			smt.close();
			con.close();

		}
		catch(SQLException e){
			e.printStackTrace();	
		}
	}

}
