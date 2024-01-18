package com.collectionwork;

import java.util.List;
import java.util.ArrayList;

public class CollectionA {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(1);
		list.add("abc");
		list.add('p');
		list.add(true);
		list.add("pqr");
		list.add(15.5f);
		
		int x=(int)list.get(0);
		System.out.println(x);
		
		String s=(String)list.get(1);
		System.out.println(s);
		
		char c=(char)list.get(2);
		System.out.println(c);
		
		boolean b=(boolean)list.get(3);
		System.out.println(b);
		
		String s1=(String)list.get(4);
		System.out.println(s1);
		
		float f=(float)list.get(5);
		System.out.println(f);
		
		
		
	}

}
