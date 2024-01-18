package com.iteratortask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List list=new ArrayList();
		Student s1=new Student();
			s1.setRollno(1);
			s1.setName("Priti");
		
		Student s2=new Student();
			s2.setRollno(2);
			s2.setName("pratu");
		
			list.add(s1);
			list.add(s2);
			Iterator itr=list.iterator();
			while(itr.hasNext()){// true   true
				Student stu=(Student)itr.next();// s1                s2
				System.out.println(stu.getRollno());//   1           2
				System.out.println(stu.getName());//  priti       pratu
				
				
			}
			
		
	}

}
