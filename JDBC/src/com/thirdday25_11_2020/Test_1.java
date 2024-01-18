package com.thirdday25_11_2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Test_1 {
	public void display(List<Student_1> liststu){
		for(Student_1 s:liststu)
		{
			System.out.println(s.getRollno());
			System.out.println(s.getName());
			System.out.println(s.getAddr());
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<Student_1> liststu=new ArrayList<Student_1>();
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		String sql="select * from studentdata";
		
		Statement smt=con.createStatement();
		
		ResultSet rs=smt.executeQuery(sql);
		while(rs.next()){
			Student_1 stu=new Student_1();
			stu.setRollno(rs.getInt(1));
			stu.setName(rs.getString(2));
			stu.setAddr(rs.getString(3));
			liststu.add(stu);
			
		}
		Test_1 t=new Test_1();
		t.display(liststu);
	}

}
