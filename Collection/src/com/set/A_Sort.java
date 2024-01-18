package com.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Q4. Write the collection program to sort element from list and not remove duplicate element. 	[20, 34, 26, 10, 20, 45, 26, 48, 10, 45, 54, 89, 20]
public class A_Sort {
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
	
	Collections.sort(list);
	//s.addAll(list);
	System.out.println("set of elements:  "+list);
	
	}
}
