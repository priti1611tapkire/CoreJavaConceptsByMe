package com.listtask1;

import java.util.ArrayList;
import java.util.List;

public class College {
	public List m1(){
		List l=new ArrayList();
		Student s=new Student();
		s.setRollno(1);
		s.setName("priya");
		
		Student s1=new Student();
		s1.setRollno(2);
		s1.setName("neha");
		
		l.add(s);
		l.add(s1);
		return l;
		
	}

}

