package com.set;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
//to remove duplicates and maintain order in accending order we use treeset
public class TestTreeSet {
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
		
		Set s=new TreeSet();
		s.addAll(list);
		System.out.println("set of elements:  "+s);
	}

}
