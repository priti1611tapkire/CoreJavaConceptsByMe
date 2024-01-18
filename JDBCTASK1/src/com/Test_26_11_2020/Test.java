package com.Test_26_11_2020;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) throws Exception{       	
		//The data which are set in m1() add it into database here using prepared statement.   
		Company c=new Company();
		Connection con=MyConnection.getConnection();
		
		List<Employee>list=c.m1();
		
		Iterator<Employee> itr=list.iterator();
		while(itr.hasNext()){
			Employee e2=itr.next();
			String sql="insert into employeetable values(?,?,?,?)";
          PreparedStatement ps=con.prepareStatement(sql);
          ps.setInt(1, e2.getEid());
          ps.setString(2, e2.getName());
          ps.setDouble(3, e2.getEsalary());
          ps.setLong(4, e2.getEmob());
			ps.execute();
		}
		System.out.println("--------Successfully Added-----");
	}

}
