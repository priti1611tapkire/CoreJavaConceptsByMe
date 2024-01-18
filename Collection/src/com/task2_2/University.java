package com.task2_2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class University {
public static void main(String args[]){  
		
		College c=new College();
		Set fe=new HashSet();
		fe=c.m1();
		
		Iterator itr=fe.iterator();// 
		while(itr.hasNext()){ // true                   ............true
			Student stu=(Student)itr.next(); // s
			System.out.println(stu.getRollno()); // 1
			System.out.println(stu.getName()); // priya
			// out of loop
		   } 
	}

}
