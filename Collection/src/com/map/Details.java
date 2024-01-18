package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Details {
	public Student1 det(){
		Student1 s1=new Student1();
		s1.setRollno(2);
		s1.setName("P");
		return s1;
	}
	public void det2(Student1 s1){
		Map<Integer, Student1> m=new HashMap<>();
		m.put(1, s1);
		Set<Integer> keys=m.keySet();
		for(int key:keys){
			System.out.println(key);
			Student1 stu=m.get(key);
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
		}
	}

}
