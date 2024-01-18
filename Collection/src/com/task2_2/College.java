package com.task2_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class College {
	 public Set m1(){      
	    	//set all student data and add it into the set here    
		     Scanner s=new Scanner(System.in);
			System.out.println("Enter String:  ");
			int s1=s.nextInt();
	    	Set fe=new HashSet();         
	    	Student stu=new Student();      
	    	stu.setRollno(2);
	    	stu.setName("Priti");
	    	
	    	Student stu1=new Student(); 
	    	stu1.setRollno(1);
	    	stu1.setName("Yogita");
	    	fe.add(stu);
	    	fe.add(stu1);
	    	
	    	return fe;
	    	
	    }
}
