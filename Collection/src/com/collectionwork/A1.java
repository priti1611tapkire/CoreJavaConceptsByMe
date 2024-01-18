package com.collectionwork;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class A1 {
	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(5);
		list.add(10);
		list.add(20);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			int x=(int)itr.next();
			System.out.println(x);
		}
		
	}

}
