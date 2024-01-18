package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.iteratortask.Student;

public class Test {
	public static void main(String args[]){  
		List list=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno:  ");
		int a=sc.nextInt();
		System.out.println("Enter Name:  ");
		String b=sc.next();
		System.out.println("Enter Rollno:  ");
		int m=sc.nextInt();
		System.out.println("Enter Name:  ");
		String n=sc.next();
		System.out.println("Enter Rollno:  ");
		int x=sc.nextInt();
		System.out.println("Enter Name:  ");
		String y=sc.next();
		
		//set (Using scanner and list) and get (Using iterator)your data here        		
		Student s=new Student();  
		s.setRollno(a);
		s.setName(b);
		
		Student s1=new Student(); 
		s1.setRollno(m);
		s1.setName(n);
	
		Student s2=new Student();
		s2.setRollno(x);
		s2.setName(y);
		
		
		list.add(s);
		list.add(s1);
		list.add(s2);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){// 
			Student stu=(Student)itr.next();//                
			System.out.println(stu.getRollno());//  
			System.out.println(stu.getName());//  
			
		
		
				} 
	}

}