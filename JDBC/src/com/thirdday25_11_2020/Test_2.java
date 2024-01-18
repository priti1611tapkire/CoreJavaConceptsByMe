package com.thirdday25_11_2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Test_2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		College c=new College();
		List<Student_2> list=c.allStudentData();
		
		Class.forName("com.mysql.jdbc.Driver");
				
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		Statement smt=con.createStatement();
		
		for(Student_2 stu:list){
			String sql="insert into studentdata values("+stu.getRollno()+" ,'"+stu.getName()+"','"+stu.getAddr()+"')";
			System.out.println(sql);
			smt.execute(sql);
		}
		
		
	}

}
