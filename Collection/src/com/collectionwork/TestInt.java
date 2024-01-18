package com.collectionwork;

import java.util.ArrayList;
import java.util.Iterator;
//Write the program to give the integer input from keyboard and add into the list, retrieve using iterator.

public class TestInt {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(22);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			int i=(int)itr.next();
			System.out.println(i);
		}
	}

}
