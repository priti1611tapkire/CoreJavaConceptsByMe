package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add(10);
		s.add(5);
		s.add(15);
		s.add(5);
		
		Iterator itr=s.iterator();
		while(itr.hasNext()){
			int x=(int)itr.next();
			System.out.println(x);
		}
		
	}

}
