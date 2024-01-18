package com.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
/*Write the jdbc program for employee. Give the dynamic input and add data into database.
Table name : employee
Variables:
int eid;
String ename;
double esalary;
long emob;*/

public class Employee_dynamicinput {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
			Class.forName("com.mysql.jdbc.Driver");
			
			
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			
		
				//String sql="insert into employeetable values(6, 'Vaishu' , '20000.00d', '942842868')";
				int eid=Integer.parseInt(args[0]);
				String ename=args[1];
				Double esalary=Double.parseDouble(args[2]);
				Long emob=Long.parseLong(args[3]);
				
				Scanner sc=new Scanner(System.in);
				/*System.out.println("enter Eid: ");
				int eid=sc.nextInt();
				System.out.println("enter Ename: ");
				String ename=sc.next();
				System.out.println("enter salary: ");
				Double esalary=sc.nextDouble();
				System.out.println("entry emob: ");
				Long emob=sc.nextLong();*/
				Statement smt=con.createStatement();
				String sql="insert into employeetable values("+eid+", '"+ename+"',"+esalary+", "+emob+")";
//				System.out.println("delelte data of eid: ");
//				int eid=sc.nextInt();
//				
//				String sql="delete from employeetable where rollno="+eid+"";
//				
				smt.execute(sql);
				System.out.println("Data deleted Successfully"+sql);
//			
			
				smt.close();
				con.close();	
	}

}
