package com.collectionwork;

import java.util.List;
import java.util.ArrayList;

public class A {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(5);
		list.add(10);
		list.add(20);
		list.add("pqr");
		list.add("abc");
		list.add(5);
		
		int x=(int)list.get(0);
		System.out.println(x);
	}
	
}

