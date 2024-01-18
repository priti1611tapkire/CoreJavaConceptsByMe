package com.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
// Q3. Write the collection program to sort element from list and remove duplicate element. 	[20, 34, 26, 10, 20, 45, 26, 48, 10, 45, 54, 89, 20] 
public class A_sort2 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(20);
		list.add(34);
		list.add(26);
		list.add(10);
		list.add(20);
		list.add(45);
		list.add(26);
		list.add(48);
		list.add(10);
		list.add(45);
		list.add(54);
		list.add(89);
		list.add(20);
		System.out.println("List of elements: "+list);
		
		Set s=new TreeSet();
		s.addAll(list);
		System.out.println("set of elements:  "+s);
		
		
	}

}
