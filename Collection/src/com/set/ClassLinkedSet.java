package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
//linkedHashset is use to remove duplicate element and without disturbing insertion order  
public class ClassLinkedSet {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(11);
		list.add(12);
		list.add(19);
		list.add(11);
		list.add(13);
		list.add(14);
		list.add(12);
		list.add(15);
		list.add(13);
		list.add(18);
		
		System.out.println("List of elements: "+list);
		
		Set s=new LinkedHashSet();
		s.addAll(list);
		System.out.println("set of elements:  "+s);
	}


}
