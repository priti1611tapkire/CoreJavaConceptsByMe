package com.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// TO REMOVE DUPLICATES FROM LIST but insertion order not preserve here
public class Test2 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(11);
		list.add(12);
		list.add(11);
		list.add(13);
		list.add(14);
		list.add(12);
		list.add(15);
		list.add(13);
		list.add(17);
		System.out.println("List of elements: "+list);
		
		Set s=new HashSet();
		s.addAll(list);
		System.out.println("set of elements:  "+s);
	}

}
