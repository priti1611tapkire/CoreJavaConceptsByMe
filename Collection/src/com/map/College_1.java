package com.map;
import java.util.*;
public class College_1 {
	
	
	public Map m1(){
  		//set all student data and add it into the map here
  	 	
	Student s=new Student();
	s.setRollno(1);
	s.setName("Priti");
	Map m=new HashMap();
	 m.put(1, s);
	
	return m;
	}
	public static void main(String[] args) {
		College_1 c=new College_1();
		Map m2=c.m1();
		Set<Integer> keys=m2.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext()){
			int key=(int)itr.next();
			System.out.println(key);
			Student val=(Student)m2.get(key);
			System.out.println(val.getRollno());
			System.out.println(val.getName());
		}
	}
}
