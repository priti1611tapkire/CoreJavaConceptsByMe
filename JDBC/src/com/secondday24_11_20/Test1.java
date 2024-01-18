package com.secondday24_11_20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// try with finally
public class Test1 {

	public static void main(String[] args) {
		Connection con=null;
		Statement smt=null;
		ResultSet rs=null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			String sql="select * from studentdata";
			 smt=con.createStatement();
			 rs=smt.executeQuery(sql);
	
			while(rs.next()){
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
			}
		
		
	}
	catch(Exception e){
		e.printStackTrace();
	}
		finally{
			if(con!=null){
				try{
					con.close();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
			
			if(smt!=null){
				try{
					rs.close();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
			
			if(rs!=null){
				try{
					rs.close();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
			}
		}
	}

}


