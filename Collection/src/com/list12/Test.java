package com.list12;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;



public class Test {
	
		public static void main(String args[]){  
			List list=new ArrayList();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Rollno:  ");
			int a=sc.nextInt();
			System.out.println("Enter Name:  ");
			String b=sc.next();
			System.out.println("Enter addr:  ");
			String c=sc.next();
			
			Student s=new Student();  
			s.setRollno(a);
			s.setName(b);
			s.setAddr(c);
			
			list.add(s);
			
			Iterator itr=list.iterator();
			while(itr.hasNext()){
				Student s1=(Student)itr.next();
				System.out.println(s1.getRollno());
				System.out.println(s1.getName());
				System.out.println(s1.getAddr());
			}
		/*	Iterator itr1=list.iterator();
			while(itr1.hasNext()){
				Student s2=(Student)itr1.next();
				System.out.println(s2.getName());
			}
			Iterator itr2=list.iterator();
			while(itr2.hasNext()){
				Student s3=(Student)itr2.next();
				System.out.println(s3.getAddr());
			}*/
	}

}

		