package jdbc_firstproject21_11_2020;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException {
		//Step-1: Load Driver Class
		try{
			Class.forName("com.mysql.jdbc.Driver");
			//Class= class  forName()=method=static method
			// Step-2:Establish Connection 
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			//Connection =interface   Drivermanager=class of Connection  .getconnection()=method of  Drivermanager
			// step-3: Construct sql Query
//				String sql="insert into studentdata values(1, 'SIDDHARTH' , 'BANGLORE')";//insert, create, delete, update
	
			//	String sql="create table student (rollno int, name varchar(255), address varchar(100), department varchar(255), fees double);";
				//String sql="insert into student values(2, 'kunal' , 'BANGLORE', 'hh', 25000.00)";
				String sql="delete from student where name='SIDDHARTH';";
				//String name="priti"; varchar - 'priti'
			//Step-4 :Construct Statement object
				Statement smt=con.createStatement();
				//Ststement - interfcae
			//Step-5: Submit sql query
				smt.execute(sql);  
//				System.out.println("Data inserted Successfully"+sql);
				System.out.println("table created Successfully"+sql);
			// Step 6: Close Connection and Statement object
				//smt.close(); //
				con.close();  //imp	
		}
		catch(SQLException e){
			e.printStackTrace();	
		}
	}
}
