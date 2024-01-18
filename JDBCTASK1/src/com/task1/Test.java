package com.task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		//Step-1: Load Driver Class
		try{
			Class.forName("com.mysql.jdbc.Driver");
			
			// Step-2:Establish Connection 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			
			// step-3: Construct sql Query
				String sql="insert into employeetable values(3, 'SIDDHARTH' , '20000.00d', '942842868')";
				
			//Step-4 :Construct Statement object
				Statement smt=con.createStatement();
				
			//Step-5: Submit sql query
				smt.execute(sql);
				System.out.println("Data inserted Successfully"+sql);
			
			// Step 6: Close Connection and Statement object
				smt.close();
				con.close();	
		}
		catch(SQLException e){
			e.printStackTrace();	
		}
	}
}