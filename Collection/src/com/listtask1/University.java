package com.listtask1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class University {
	public static void main(String[] args) {
		College c=new College();
		List list=new ArrayList(); //
		list=c.m1();
		Iterator itr=list.iterator();// 
		while(itr.hasNext()){ // true                   ............true
			Student stu=(Student)itr.next(); // s
			System.out.println(stu.getRollno()); // 1
			System.out.println(stu.getName()); // priya
			// out of loop
		}

}
}
