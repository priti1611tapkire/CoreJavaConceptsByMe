package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//Q1. Write the collection program to remove duplicate element from list. 	[Abc, ABC, Abc, ABC, ABc, Abc, ABC] 
public class A_set {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Abc");
		list.add("ABC");
		list.add("Abc");
		list.add("ABC");
		list.add("ABc");
		list.add("Abc");
		list.add("ABC");
		
		System.out.println("List of elements: "+list);
		
		Set s=new HashSet();
		s.addAll(list);
		System.out.println("set of elements:  "+s);
	}
}
