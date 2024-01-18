package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
public static void main(String[] args) {
	Student s1=new Student();
	s1.setRollno(2);
	s1.setName("P");
	
	Student s2=new Student();
	s2.setRollno(22);
	s2.setName("PR");
	
	Map<String, Student>m=new HashMap<>();
	m.put("aaa", s1);
	m.put("qqq", s2);
	
	Set<String>keys=m.keySet();
	for(String key:keys){//true....true
		System.out.println(key);// aaa...qqq
		Student stu=m.get(key);//aaa=key....stu=s1  qqq=key....val=stu=s2=value
		System.out.println(stu.getRollno());// 2  ......22
		System.out.println(stu.getName());//p ...........PR
	}
}
}
