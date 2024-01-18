package com.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//. Write the collection program to remove duplicate element from list and retrive element indexwise. 	[20.20, 34.1, 26.23, 10, 20.20, 45, 26.23, 48, 10, 45, 54, 89, 20] 
public class A_SetIndex {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(20.20);
		list.add(34.1);
		list.add(34.1);
		list.add(26.23);
		list.add(10);
		list.add(20.20);
		list.add(45);
		list.add(26.23);
		list.add(48);
		list.add(10);
		list.add(45);
		list.add(54);
		list.add(89);
		list.add(20);
		
		System.out.println("List of elements: "+list);
		Set s=new LinkedHashSet();
		s.addAll(list);
		System.out.println("set of elements:  "+s);
	}

}
