package com.treeset;

import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) { 
		Employee e1=new Employee();
		e1.setEmid(22);
		e1.setEmname("Neha");
		e1.setSalary(25000);
		
		Employee e2=new Employee();
		e2.setEmid(21);
		e2.setEmname("Sneha");
		e2.setSalary(5000);
		
		Employee e3=new Employee();
		e3.setEmid(23);
		e3.setEmname("Reha");
		e3.setSalary(28000);
		
		Set<Employee> s=new TreeSet<>();
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
		for(Employee e: s){
			System.out.println(e.getEmid());
			System.out.println(e.getEmname());
			System.out.println(e.getSalary());
		}
	} 

}
