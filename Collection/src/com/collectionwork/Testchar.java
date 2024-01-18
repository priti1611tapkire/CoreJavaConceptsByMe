package com.collectionwork;

import java.util.ArrayList;
import java.util.Iterator;
//1. Write the program to add Character into the list and retrieve all elements using iterator.

public class Testchar {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add('A');
		list.add('B');
		list.add('C');
		list.add('D');
		list.add('E');
		list.add('F');
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			char c=(char)itr.next();
			System.out.println(c);
		}
	}
}
